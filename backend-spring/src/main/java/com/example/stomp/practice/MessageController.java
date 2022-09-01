//package com.example.stomp;
//
//import com.example.stomp.domain.message.Message;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
//import org.springframework.messaging.simp.SimpMessageSendingOperations;
//import org.springframework.stereotype.Controller;
//
//@Slf4j
//@Controller
//@RequiredArgsConstructor
//public class MessageController {
//
//    private final SimpMessageSendingOperations simpMessageSendingOperations;
//
////    @MessageMapping("/hello")
////    public void message(Message message) {
////        log.info("message={}", message);
////        simpMessageSendingOperations.convertAndSend("/sub/channel/" + message.getChannelId(), message);
////    }
//
//    @MessageMapping("/hello")
//    public void message(@Payload Message message, SimpMessageHeaderAccessor headerAccessor) {
//        log.info("message={}", message);
//        headerAccessor.getSessionAttributes().put("username", message.getSender());
//        simpMessageSendingOperations.convertAndSend("/topic/" + message.getChannelId(), message);
//    }
//}
