package club.zenyuca.entity

import javax.annotation.Generated
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.Min

@Entity
class Girl {
    @Id
    @GeneratedValue
    Integer id
    String name
    @Min(value = 18l, message = "未成年不得入内")
    Integer age

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Integer getAge() {
        return age
    }

    void setAge(Integer age) {
        this.age = age
    }
}
