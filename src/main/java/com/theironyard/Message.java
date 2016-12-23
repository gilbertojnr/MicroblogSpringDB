package com.theironyard;

import javax.persistence.*;

/**
 * Created by gilbertakpan on 12/21/16.
 */
@Entity
@Table(name = "microblog")
public class Message {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String text;


    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

//    public Message(String text, int id) {
//        this.text = text;
//        this.id = id;
//    }
}

