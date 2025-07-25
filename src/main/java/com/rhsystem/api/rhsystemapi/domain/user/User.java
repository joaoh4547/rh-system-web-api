package com.rhsystem.api.rhsystemapi.domain.user;

import com.rhsystem.api.rhsystemapi.core.valueobject.DomainEntity;
import com.rhsystem.api.rhsystemapi.domain.history.processor.HistoryProvider;

import java.util.UUID;

/**
 * Represents a user in the system. This class serves as a domain entity that encapsulates
 * the key attributes and functionality related to a user.
 */
@HistoryProvider(value = UserHistoryGenerator.ENTITY_NAME, generator = UserHistoryGenerator.class)
public class User extends DomainEntity<UUID> {

    /**
     * The name of the user. This field is mapped to the "NAME" column in the database.
     */
    private String name;

    /**
     * The email of the user. This field is mapped to the "EMAIL" column in the database.
     */
    private String email;

    /**
     * The username of the user. This field is mapped to the "USERNAME" column in the database.
     */
    private String userName;

    /**
     * The password of the user. This field is mapped to the "PASSWORD" column in the database.
     */
    private String password;

    private UserStatus status;

    /**
     * Gets the name of the user.
     *
     * @return the name of the user
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the user.
     *
     * @param name the name to set for the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email of the user.
     *
     * @return the email of the user
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Sets the email of the user.
     *
     * @param email the email to set for the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password of the user.
     *
     * @return the password of the user
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password the password to set for the user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the username of the user.
     *
     * @return the username of the user
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Sets the username of the user.
     *
     * @param userName the username to set for the user
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "key=" + getKey().getValue() +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
