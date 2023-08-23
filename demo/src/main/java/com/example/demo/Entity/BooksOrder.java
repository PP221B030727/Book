package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false , name="order_id")

    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Books book;

    @Column(name = "order_date")
    private LocalDateTime orderDate;
    @Column(name = "return_date")
    private LocalDateTime returnDate;

}
