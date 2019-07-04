package com.example.awtSample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String string = "I an a string. Yes, Iam.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiiiiklo349jjeijdij";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "Y"));


        String secondString = "abcDeeeF12GhhiiiabcDeeeiiikloabcDeee349jjeijdij";
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^Hello"));
        System.out.println(alphanumeric.matches("^bcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiiiiklo349jjeijdij"));

        System.out.println(alphanumeric.replaceAll("jjeijdij", "The Eend"));
        System.out.println(alphanumeric.replaceAll("[iiiik]", "X"));
        System.out.println(alphanumeric.replaceAll("[iiiik]", "I replaced the letter here"));
        System.out.println(alphanumeric.replaceAll("[klo][jjeijd]", "X"));

        System.out.println("harry".replaceAll("[hH]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiiiiklo349jjeijdij";
        System.out.println(newAlphanumeric);
        System.out.println(newAlphanumeric.replaceAll("[^ei]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef234567]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F2-7]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f2-7]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a newLine\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));//remove the white spaces
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));//\t replaced by X
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));//all alphabets replacced by X
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));//all starting and ending letters of words replacced by X

        String thirdAlphanumeric = "abcDeeeF12Ghhiiiiiiklo349jjeijdij";
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-Heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Patteren = "<h2>";
        Pattern pattern = Pattern.compile(h2Patteren);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPatten = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        //[^abc]
        String tcTest="tstvkt";
        String tNotVRegExp="t[^v]";
        Pattern tNotVPattern= Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher= tNotVPattern.matcher(tcTest);

        count=0;
        while (tNotVMatcher.find()){
            count++;
            System.out.println("Occurance "+count+" : "+tNotVMatcher.start()+ " to "+tNotVMatcher.end());
        }

        // t(?=v)
        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890";  // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7898"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        // ^4[0-9]{12}([0-9]{3})?$
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444";  // should match
        String visa4 = "4444";  // shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));


    }
}
