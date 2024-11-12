package com.demo.lucky_platform.web.chat.domain;

import com.demo.lucky_platform.web.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Builder
@EqualsAndHashCode(callSuper = true)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "chat", indexes = {})
public class Chat extends BaseEntity {

    @Id
    @Column(name = "chat_id", columnDefinition = "bigint(20)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;

    @Column(name = "sender",columnDefinition = "varchar(20)")
    private String sender;

    @Column(name = "senderEmail",columnDefinition = "varchar(20)")
    private String senderEmail;

    @Column(name = "message",columnDefinition = "text")
    private String message;
}
