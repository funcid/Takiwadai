package ru.func.takiwadai.entity.task;

import lombok.*;
import ru.func.takiwadai.entity.component.Lang;
import ru.func.takiwadai.entity.task.test.TestUnit;
import ru.func.takiwadai.entity.user.User;

import javax.persistence.*;
import java.util.List;

/**
 * @author func 22.04.2020
 * @project ru.func.takiwadai.Takiwadai
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private User author;
    private String heading;
    private String content;
    @OneToMany
    private List<TestUnit> tests;
    @ElementCollection
    private List<TaskTag> tags;
    private Long memoryLimit;
    private Long timeLimit;
    private Long createTimestamp;
    @ElementCollection
    private List<Lang> accessibleLanguages;
    private Long pp;
}
