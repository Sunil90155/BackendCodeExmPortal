/*
 * package com.exam.model.exam;
 * 
 * import java.util.HashSet; import java.util.Set;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.ManyToOne; import javax.persistence.OneToMany;
 * 
 * import com.fasterxml.jackson.annotation.JsonIgnore;
 * 
 * @Entity //@Table(name = "quiz") public class Quiz {
 * 
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private long qId;
 * 
 * private String title;
 * 
 * private String description;
 * 
 * private String maxMark;
 * 
 * private String numberOfQuestion;
 * 
 * private boolean active = false; //add more if you want
 * 
 * @ManyToOne(fetch = FetchType.EAGER) private Category category;
 * 
 * @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade =
 * CascadeType.ALL )
 * 
 * @JsonIgnore//jab bhi ham qiz ko seralrise karengye tab data nahi milega,jab
 * bhi quiz fatch karengye to data nahi milega private Set<Question> questions=
 * new HashSet<>();
 * 
 * 
 * public Quiz() { super(); }
 * 
 * 
 * public Quiz(long qId, String title, String description, String maxMark,
 * String numberOfQuestion, boolean active, Category category, Set<Question>
 * questions) { super(); this.qId = qId; this.title = title; this.description =
 * description; this.maxMark = maxMark; this.numberOfQuestion =
 * numberOfQuestion; this.active = active; this.category = category;
 * this.questions = questions; }
 * 
 * public long getqId() { return qId; }
 * 
 * public void setqId(long qId) { this.qId = qId; }
 * 
 * public String getTitle() { return title; }
 * 
 * public void setTitle(String title) { this.title = title; }
 * 
 * public String getDescription() { return description; }
 * 
 * public void setDescription(String description) { this.description =
 * description; }
 * 
 * public String getMaxMark() { return maxMark; }
 * 
 * public void setMaxMark(String maxMark) { this.maxMark = maxMark; }
 * 
 * public String getNumberOfQuestion() { return numberOfQuestion; }
 * 
 * public void setNumberOfQuestion(String numberOfQuestion) {
 * this.numberOfQuestion = numberOfQuestion; }
 * 
 * public boolean isActive() { return active; }
 * 
 * public void setActive(boolean active) { this.active = active; }
 * 
 * public Set<Question> getQuestions() { // TODO Auto-generated method stub
 * return null; }
 * 
 * public String getNumberOfQuestions() { // TODO Auto-generated method stub
 * return null; }
 * 
 * 
 * public String getMaxMarks() { // TODO Auto-generated method stub return null;
 * }
 * 
 * }
 */

package com.exam.model.exam;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long qId;


    private String title;

    @Column(length = 5000)
    private String description;

    private String maxMarks;

    private String numberOfQuestions;

    private boolean active = false;
    //add..

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Question> questions = new HashSet<>();


    public Quiz() {
    }

    public Long getqId() {
        return qId;
    }

    public void setqId(Long qId) {
        this.qId = qId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(String maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(String numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
}
