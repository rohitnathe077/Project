package com.Instagram.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mylogic {
	private static List<User> users = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();
    private static User currentUser;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Post");
            System.out.println("4. View Posts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextLine();

            switch (choice) {
                case "1":
    System.out.print("Enter username: ");
    String username = in.nextLine();
    System.out.print("Enter password: ");
    String password = in.nextLine();

    // Input validation
    if (username.isEmpty() || password.isEmpty()) {
        System.out.println("Username and password cannot be empty.");
        break;
    }

//      existing user
    boolean userExists = false;
    for (User user : users) {
        if (user.username.equals(username)) {
            userExists = true;
            break;
        }
    }

    if (userExists) {
        System.out.println(" Username already exists. Please choose a different username.");
    } else {
        // Create new user
        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("Registration successful! You can now log in.");
    }
                    break;
                case "2":
                    // Login logic
                    System.out.print("Enter username: ");
                    String loginUsername = in.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = in.nextLine();

                    // Input validation
                    if (loginUsername.isEmpty() || loginPassword.isEmpty()) {
                        System.out.println("Username and password cannot be empty.");
                        break;
                 }

                 // Check for existing user and validate password
                    boolean loginSuccess = false;
                    for (User user : users) {
                        if (user.username.equals(loginUsername) && user.password.equals(loginPassword)) {
                            currentUser = user;
                           loginSuccess = true;
                            break;
                        }
                    }

                    if (loginSuccess) {
                        System.out.println("Login successful! Welcome, " + currentUser.username + "!");
                    } else {
                        System.out.println("Invalid username or password. Please try again.");
                    }
                    break;
                case "3":
                    // Post creation logic
                    if (currentUser == null) {
                        System.out.println("You must be logged in to create a post.");
                        break;
                    }

                    System.out.print("Enter post content: ");
                    String postContent = in.nextLine();

                    // Create new post
                    Post newPost = new Post(postContent, currentUser);
                    posts.add(newPost);
                    System.out.println("Post created successfully!");
                    break;
                case "4":
                    // View posts logic
                    if (posts.isEmpty()) {
                        System.out.println("No posts available.");
                    } else {
                        System.out.println("Posts:");
                        for (Post post : posts) {
                            System.out.println(post.user.username + ": " + post.content);
                        }
                    }
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

