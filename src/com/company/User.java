package com.company;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length()>20){
            throw new IllegalNameLengthException("Длина имени не может быть больше 20 символов. Вы ввели "+name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age<=0 || age >=100){
            throw new IllegalAgeException("Возраст человека не может быть меньше 0 или больше 100. Вы ввели "+age);
        }
        this.age = age;
    }
}
