package com.example.timewithkid;

import java.util.ArrayList;

public class ActivityHelper {
    private ArrayList<Activity> activities = new ArrayList<>();


    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void addActivities() {
        activities.add( new Activity(R.drawable.pineconeclosedopen, R.drawable.pineconepreschoolsciencexperiment,"CLOSED CONES",
                "materials:\n" +
                "- two pinecones from a white pine or hemlock pine\n" +
                "- bowl of tap water\n" +
                "- timer",
                "PROCEDURE:\n1. Place one pinecode in the tap water for 10 minutes\n2. Keep one dry.\n What happens to the wet pinecone in comparison" +
                " to the dry one?\n" +
                "3. Let the pinecone dry out and inspect it again.",
                "EXPLANATION:\nAfter few minutes, the wet pinecone's scales started to close."));

        activities.add( new Activity(R.drawable.pinecone, R.drawable.pinecone,"CLOUD PREDICTIONS\nWhat Do Different Types of Clouds Mean?",
                "materials:\n" +
                "- clouds\n",
                "PROCEDURE:\n1. Lie on your back and observe the clouds\n2. Read the descriptions below and determine what types of clouds are in the sky.\n " +
                        "Study the clouds and determine what is going on in the atmosphere",
                "EXPLANATION:\nClouds will look different depending on conditions in the atmosphere. When you watch the clouds build and move along, you might be able to " +
                        "predict the type of weather is coming. Cirrus clouds are the highest clouds. They are made entirely of ice crystals.They usually indicate snow or rain. " +
                        "Stratus clouds are low hanging. They are so spread out that they often resemble fog."));
        activities.add( new Activity(R.drawable.pinecone, R.drawable.pinecone,"CLOSED CONES", "materials:\n" +
                "- two pinecones from a white pine or hemlock pine\n" +
                "- bowl of tap water\n" +
                "- timer", "PROCEDURE:\n1. Place one pinecode in the tap water for 10 minutes\n2. Keep one dry.\n What happens to the wet pinecone in comparison" +
                " to the dry one?\n" +
                "3. Let the pinecone dry out and inspect it again.", "EXPLANATION:\nAfter few minutes, the wet pinecone's scales started to close."));
        activities.add( new Activity(R.drawable.pinecone, R.drawable.pinecone,"CLOSED CONES", "materials:\n" +
                "- two pinecones from a white pine or hemlock pine\n" +
                "- bowl of tap water\n" +
                "- timer", "PROCEDURE:\n1. Place one pinecode in the tap water for 10 minutes\n2. Keep one dry.\n What happens to the wet pinecone in comparison" +
                " to the dry one?\n" +
                "3. Let the pinecone dry out and inspect it again.", "EXPLANATION:\nAfter few minutes, the wet pinecone's scales started to close."));
        activities.add( new Activity(R.drawable.pinecone, R.drawable.pinecone,"CLOSED CONES", "materials:\n" +
                "- two pinecones from a white pine or hemlock pine\n" +
                "- bowl of tap water\n" +
                "- timer", "PROCEDURE:\n1. Place one pinecode in the tap water for 10 minutes\n2. Keep one dry.\n What happens to the wet pinecone in comparison" +
                " to the dry one?\n" +
                "3. Let the pinecone dry out and inspect it again.", "EXPLANATION:\nAfter few minutes, the wet pinecone's scales started to close."));
    }


}
