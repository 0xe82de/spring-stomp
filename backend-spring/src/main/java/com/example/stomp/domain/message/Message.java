package com.example.stomp.domain.message;

import com.example.stomp.domain.user.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "message")
@Getter
@Setter
public class Message extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Integer id;

    private String content;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conversation_id")
    private Conversation conversation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private com.example.stomp.domain.user.User User;

    public Message() {
    }

    public Message(String content, Conversation conversation, User user) {
        this.content = content;
        this.conversation = conversation;
        User = user;
    }

    public Message(String content, String imageName, String imageUrl, Conversation conversation, User user) {
        this.content = content;
        this.imageName = imageName;
        this.imageUrl = imageUrl;
        this.conversation = conversation;
        User = user;
    }
}
