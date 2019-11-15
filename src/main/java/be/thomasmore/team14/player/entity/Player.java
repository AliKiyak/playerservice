package be.thomasmore.team14.player.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "player")
@Data
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "gamerTag")
    private String gamerTag;

    @Column(name = "realName")
    private String realName;

    @Column(name = "age")
    private int age;

    @Column(name = "mouse")
    private String mouse;

    @Column(name = "mousepad")
    private String mousepad;

    @Column(name = "keyboard")
    private String keyboard;

    @Column(name = "headset")
    private String headset;

    @Column(name = "picture")
    private String picture;

    @Column(name = "teamId")
    private String teamId;
}
