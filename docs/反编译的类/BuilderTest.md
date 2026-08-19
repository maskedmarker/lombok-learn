

## BuilderTest$User

```java
public class BuilderTest$User {
    @NonNull
    private String name;
    private int age;

    BuilderTest$User(@NonNull String name, int age) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        this.name = name;
        this.age = age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public String toString() {
        return "BuilderTest.User(name=" + getName() + ", age=" + getAge() + ")";
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
```

## BuilderTest$User$UserBuilder

```java
public class BuilderTest$User$UserBuilder {
    private String name;
    private int age;

    BuilderTest$User$UserBuilder() {
    }

    public BuilderTest$User$UserBuilder name(@NonNull String name) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        this.name = name;
        return this;
    }

    public BuilderTest$User$UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public BuilderTest.User build() {
        return new BuilderTest.User(this.name, this.age);
    }

    public String toString() {
        return "BuilderTest.User.UserBuilder(name=" + this.name + ", age=" + this.age + ")";
    }
}
```