
## org.example.learn.lombok.model.User 编译后的样子

```java
package org.example.learn.lombok.model;

public class User {
    private String name;
    private int age;

    public User() {
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name == null) {
                        return this.getAge() == other.getAge();
                    }
                } else if (this$name.equals(other$name)) {
                    return this.getAge() == other.getAge();
                }

                return false;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        result = result * 59 + this.getAge();
        return result;
    }

    public String toString() {
        return "User(name=" + this.getName() + ", age=" + this.getAge() + ")";
    }
}
```