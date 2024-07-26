package com.radhika.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//
//@Document(collection = "users")
//@Data
//@Builder
//public class User {
//
//    @Id
//    private ObjectId id;
//    @Indexed(unique = true)
//    @NonNull
//    public String userName;
//    @NonNull
//    private String password;
//
//    @DBRef
//    public List<JournalEntry> journalEntries = new ArrayList<>();
//    private List<String> roles;


    @Document(collection = "users")
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class User {

        @Id
        private ObjectId id;
        @Indexed(unique = true)
        @NonNull
        private String userName;
        private String email;
//        private boolean sentimentAnalysis;
        @NonNull
        private String password;
        @DBRef
        private List<JournalEntry> journalEntries = new ArrayList<>();
        private List<String> roles;


    }