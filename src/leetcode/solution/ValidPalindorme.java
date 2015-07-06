{\rtf1\ansi\ansicpg936\cocoartf1347\cocoasubrtf570
{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red170\green13\blue145;\red0\green116\blue0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab529
\pard\tx529\pardeftab529\pardirnatural

\f0\fs22 \cf2 \CocoaLigature0 package\cf0  leetcode.solution;\
\
\cf3 /**\
 * Created by CosmosHannah on 7/5/2015.\
 */\
\
public class ValidPalindrome \{\
      public static boolean isPalindrome(String s) \{\
\
        if(s==null||s.isEmpty()) return true;\
\
        int start = 0, end = s.length()-1;\
        while (start<end)\
        \{\
            if(!((s.charAt(start)>='A'&&s.charAt(start)<='Z')||(s.charAt(start)>='a'&&s.charAt(start)<='z')||(s.charAt(start)>='0'&&s.charAt(start)<='9')))\
            \{\
                start++;\
                continue;\
            \}\
\
            if(!((s.charAt(end)>='A'&&s.charAt(end)<='Z')||(s.charAt(end)>='a'&&s.charAt(end)<='z')||(s.charAt(end)>='0'&&s.charAt(end)<='9')))\
            \{\
                end--;\
                continue;\
            \}\
\
            \
            if (s.substring(start, start+1).equalsIgnoreCase(s.substring(end, end+1))) \{\
                    start++;\
                    end--;\
            \} else return false;\
            \
            \
\
        \}\
\
        return true;\
\
    \}\
\}\
\
}