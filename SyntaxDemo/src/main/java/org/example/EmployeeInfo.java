package org.example;

public class EmployeeInfo {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String email;
    private String phoneNumber;
    private String street;
    private String city;
    private String state;
    private String zip;


    public EmployeeInfo(
            String firstName,
            String lastName,
            int birthYear,
            int birthMonth,
            int birthDay,
            String email,
            String phoneNumber,
            String street,
            String city,
            String state,
            String zip
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.email = email;
        this.street = street;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getEmail() {
        return email;
    }

    public String getState() {
        return state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
}

