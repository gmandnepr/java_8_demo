package streams;

public class AgeGroup {

    private final int age;
    private int count;

    public AgeGroup(int age) {
        this.age = age;
        this.count = 1;
    }

    public int getAge() {
        return age;
    }

    public int getCount() {
        return count;
    }

    public void incCount() {
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AgeGroup ageGroup = (AgeGroup) o;

        return age == ageGroup.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public String toString() {
        return "{age:" + age + ",count:" + count + "}";
    }
}
