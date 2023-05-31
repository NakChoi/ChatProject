package project.chat.chat.domain.websocket;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@RequiredArgsConstructor
@EnableWebSocket // @EnableWebSocket 어노테이션을 사용해 WebSocket을 활성화
public class WebSocketConfig implements WebSocketConfigurer { // 핸들러를 이용해 WebSocket을 활성화하기 위한 Config

    private final ChatHandler chatHandler;


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(chatHandler, "ws/chat").setAllowedOrigins("*");
        // WebSocket에 접속하기 위한 Endpoint는 /chat으로 설정
    }
}
