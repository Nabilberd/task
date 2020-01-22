package com.karetis.task.domainobject;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.ZonedDateTime;

@Entity
@Table(name = "random_data")
@Data
public class RandowDataDO
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRandomData;

    @Column(nullable = false)
    private BigInteger random1;

    @Column(nullable = false)
    private BigInteger random2;

    @Column(nullable = false)
    private BigInteger random3;

}
