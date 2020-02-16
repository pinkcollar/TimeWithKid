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
                "EXPLANATION:\nAfter few minutes, the wet pinecone's scales started to close. Pinecones rely on the force of wind to blow " +
                        "their seed to a spot where they can grow. Therefore, the seeds must be light and dry as possible. During rainstorms, the pinecones act as little umbrellas" +
                        "to keep the seeds dry. When the pinecone dries, it opens again. "));

        activities.add( new Activity(R.drawable.clouds, R.drawable.cloudstypes,"CLOUD PREDICTIONS",
                "materials:\n" +
                "- clouds\n",
                "What Do Different Types of Clouds Mean?\n\n" +
                        "PROCEDURE:\n1. Lie on your back and observe the clouds\n2. Read the descriptions below and determine what types of clouds are in the sky.\n " +
                        "Study the clouds and determine what is going on in the atmosphere",
                "EXPLANATION:\nClouds will look different depending on conditions in the atmosphere. When you watch the clouds build and move along, you might be able to " +
                        "predict the type of weather is coming. Cirrus clouds are the highest clouds. They are made entirely of ice crystals.They usually indicate snow or rain. " +
                        "Stratus clouds are low hanging. They are so spread out that they often resemble fog. They strech across the sky in long, horisontal layers and develop when cold air cut" +
                        "under warm, moist filled air. They often produce long, steady rains or snow. Cumulus clouds are fluffy, cauliflower-shaped clouds with flat, broad bases. Usually they form" +
                        "on top of rapidly rising currents of warm air. These clouds form on clear days. "));
        activities.add( new Activity(R.drawable.egg, R.drawable.egginside,"INVESTIGATING EGGS", "materials:\n" +
                "- chicken egg\n" +
                "- magnifying lens\n" +
                "- bowl\n" +
                "- toothpick", "PROCEDURE:\n1. If the egg was in the refrigerator, let it sit out for a while to warm.\n2. Exemine the outside og the egg under the magnifying lens.\n" +
                "3. Slowly crack the egg open over a bowl and examine the inside of the shell under magnifying lens.\n" +
                "4. Study the inside of the egg. Notice the membrane inside the shell.\n" +
                "5. Examine the yolk. What is the thin membrane around the yolk holding it in a round shape?", "EXPLANATION:\nA chicken egg is a single cell that contains its own food. "));
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
