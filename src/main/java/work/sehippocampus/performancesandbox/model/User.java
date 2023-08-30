package work.sehippocampus.performancesandbox.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

}