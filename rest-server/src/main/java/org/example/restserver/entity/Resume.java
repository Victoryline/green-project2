package org.example.restserver.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tbl_resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "username", nullable = false)
    private User username;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "wish_area", length = 50)
    private String wishArea;

    @Column(name = "wish_salary")
    private Integer wishSalary;

    @Column(name = "wish_time", length = 20)
    private String wishTime;

    @Column(name = "work_code", length = 20)
    private String workCode;

    @Column(name = "portfolio_link", length = 200)
    private String portfolioLink;

    @Column(name = "offer_yn")
    private Character offerYn;

    @Column(name = "create_date", nullable = false)
    private Instant createDate;

    @Column(name = "modify_date")
    private Instant modifyDate;

    @ColumnDefault("0")
    @Column(name = "job_history")
    private Integer jobHistory;

}