

## DataTest$User

```java
public class DataTest$User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof DataTest$User) {
            DataTest$User other = (DataTest$User) o;
            if (other.canEqual(this)) {
                Object this$name = getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }
                return getAge() == other.getAge();
            }
            return false;
        }
        return false;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DataTest$User;
    }

    public int hashCode() {
        Object $name = getName();
        int result = (1 * 59) + ($name == null ? 43 : $name.hashCode());
        return (result * 59) + getAge();
    }

    public String toString() {
        return "DataTest.User(name=" + getName() + ", age=" + getAge() + ")";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
```