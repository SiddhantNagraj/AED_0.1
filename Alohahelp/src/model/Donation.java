/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author revat
 */
public class Donation {
    
        private String amount;
    private String donationDate;
    private String accntNumber;
    private String accntName;
    public static String toAccountNumber = "2340987123";
    
    private static int count = 0;
    private int donationId;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public String getAccntNumber() {
        return accntNumber;
    }

    public void setAccntNumber(String accntNumber) {
        this.accntNumber = accntNumber;
    }

    public String getAccntName() {
        return accntName;
    }

    public void setAccntName(String accntName) {
        this.accntName = accntName;
    }

    public static String getToAccountNumber() {
        return toAccountNumber;
    }

    public static void setToAccountNumber(String toAccountNumber) {
        Donation.toAccountNumber = toAccountNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Donation.count = count;
    }

    public int getDonationId() {
        return donationId;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }
    
    
    
}
