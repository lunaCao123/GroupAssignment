package com.example.barbootcamp.model;

import com.example.barbootcamp.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class QuestionBank {

    public static Question getQuestionByTopic(int topicID) {
        return questions.get(topicID);
    }
    public static ArrayList<Question>getQuestionListByTopic(int topicID){
        return new ArrayList<Question>((List)Arrays.asList(questions.get(topicID)));
    }

    public static ArrayList<Question> getAllQuestions() {
        return new ArrayList<Question>((List) Arrays.asList(questions.values().toArray()));
    }

    private static final HashMap<Integer, Question> questions = new HashMap<>();

    static {
        questions.put(1, new Question(
                1,
                1,
                1,
                "Which ingredient is NOT often used when brewing beer?",
                "Cornstarch",
                "Wheat",
                "Cornstarch",
                "Maize",
                "Rice"
        ));
        questions.put(2, new Question(
                2,
                1,
                2,
                "If someone is asking for a beer that pairs well with spicy noodles, which would you suggest?",
                "Wheat beer",
                "Wheat beer",
                "IPA",
                "Stout",
                "Porter"
        ));
        questions.put(3, new Question(
                3,
                1,
                3,
                "Which flavour palette would you most associate with a Stout?",
                "Chocolate, roasted flavour. Not a lot of bitterness or alcohol content.",
                "Bitter flavour, with the brewer having added citrus or herbal tones.",
                "Dry crisp finish, with notes of sweet caramel to complement the malt taste.",
                "Smooth texture, lighter carbonation, and very versatile.",
                "Chocolate, roasted flavour. Not a lot of bitterness or alcohol content."
        ));
        questions.put(4, new Question(
                4,
                1,
                4,
                "What is the main difference between red and white wine?",
                "White wine is pressed before fermentation, red wine is pressed after fermentation",
                "White wine is pressed before fermentation, red wine is pressed after fermentation",
                "White wine is made from white grapes, red wine is made from red grapes",
                "White wine is not aged, red wine is aged",
                "White wine is made in Champagne, red wine is made in California"
        ));
        questions.put(5, new Question(
                5,
                1,
                5,
                "What benefit does wine drinking have on your health?",
                "30% lower risk of dying from heart disease",
                "15% risk of reducing blindness",
                "45% chance of improving memory",
                "20% lower risk of getting diabetes",
                "30% lower risk of dying from heart disease"
        ));
        questions.put(6, new Question(
                6,
                2,
                1,
                "What can vodka be made of?",
                "All of the above",
                "Grains",
                "Grapes",
                "Corn",
                "All of the above"
        ));
        questions.put(7, new Question(
                7,
                2,
                2,
                "What is the key ingredient in Gin?",
                "Juniper",
                "Orris",
                "Licorice",
                "Juniper",
                "Coriander"
        ));
        questions.put(8, new Question(
                8,
                2,
                3,
                "Which one is NOT a type of gin?",
                "Old Earl",
                "Genever",
                "Old Earl",
                "London Dry",
                "Bathtub"
        ));
        questions.put(9, new Question(
                9,
                2,
                4,
                "Which whisky is made with 51% corn?",
                "Bourbon",
                "Irish",
                "Bourbon",
                "Single Malt",
                "Japanese"
        ));
        questions.put(10, new Question(
                10,
                2,
                5,
                "What is the base spirit for a Moscow Mule?",
                "Vodka",
                "Whisky",
                "Bourbon",
                "Gin",
                "Vodka"
        ));
        questions.put(11, new Question(
                11,
                3,
                1,
                "What is the key ingredient in Tequila?",
                "Blue Agave",
                "Sugar",
                "Salt",
                "Lime",
                "Blue Agave"
        ));
        questions.put(12, new Question(
                12,
                3,
                2,
                "What does it mean if a tequila is Mixtos?",
                "It can contain no less than 51% agave",
                "It has been aged at least 3 years",
                "It can contain no less than 51% agave",
                "It is made within the Tequila region",
                "It goes well with a Margarita"
        ));
        questions.put(13, new Question(
                13,
                3,
                3,
                "What trend that has recently emerged has made Rum popular?",
                "Tiki",
                "Soho",
                "Boho",
                "Friki",
                "Tiki"
        ));
        questions.put(14, new Question(
                14,
                3,
                4,
                "In what region is Armagnac produced?",
                "Gascony region",
                "Gascony region",
                "Champagne",
                "Fins Bois",
                "Bois Communs"
        ));
        questions.put(15, new Question(
                15,
                3,
                5,
                "What is the minimum time for an XO Cognac to be aged?",
                "6 years",
                "5 years",
                "6 years",
                "7 years",
                "8 years"
        ));
        questions.put(16, new Question(
                16,
                4,
                1,
                "What is the technique used to make a Margarita?",
                "Shaken",
                "Shaken",
                "Stirred",
                "Muddled",
                "Blended"
        ));
        questions.put(17, new Question(
                17,
                4,
                2,
                "How much egg white do you use in a Whisky Sour?",
                "15ml",
                "5ml",
                "10ml",
                "15ml",
                "20ml"
        ));
        questions.put(18, new Question(
                18,
                4,
                3,
                "Which cocktail contains agave syrup?",
                "Tommy's Margarita",
                "Mojito",
                "Old Fashioned",
                "Margarita",
                "Tommy's Margarita"
        ));
        questions.put(19, new Question(
                19,
                4,
                4,
                "What is the garnish for a Negroni?",
                "Orange Slice",
                "Orange Peel",
                "Orange Slice",
                "Grapefruit Bitters",
                "Orange Bitters"
        ));
        questions.put(20, new Question(
                20,
                4,
                5,
                "What are the specifications for an Espresso Martini?",
                "45ml Vodka, 15ml Coffee Liquer, 30ml Fresh Coffee, 10ml Sugar Syrup",
                "45ml Vodka, 45ml Coffee Liquer, 60ml Fresh Coffee, 5ml Sugar Syrup",
                "30ml Vodka, 30ml Coffee Liquer, 30ml Fresh Coffee, 30ml Sugar Syrup",
                "45ml Vodka, 15ml Coffee Liquer, 30ml Fresh Coffee, 10ml Sugar Syrup",
                "60ml Vodka, 10ml Coffee Liquer, 60ml Fresh Coffee, 5ml Sugar Syrup"
        ));
        questions.put(21, new Question(
                21,
                5,
                1,
                "What tool is used to extract flavours from a whole fruit?",
                "Muddler",
                "Knife",
                "Muddler",
                "Juicer",
                "Chopping board"
        ));
        questions.put(22, new Question(
                22,
                5,
                2,
                "What is the usual measure of a jigger?",
                "30ml on one side, 15ml on the other",
                "60ml on one side, 30ml on the other",
                "50ml on one side, 25ml on the other",
                "20ml on one side, 10ml on the other",
                "30ml on one side, 15ml on the other"
        ));
        questions.put(23, new Question(
                23,
                5,
                3,
                "Which strainer would you use to strain ice from a mixing glass?",
                "Julep Strainer",
                "Fine Strainer",
                "Hawthorne Strainer",
                "Julep Strainer",
                "None of the Above"
        ));
        questions.put(24, new Question(
                24,
                5,
                4,
                "Which shaker are you most likely to find in someone's home?",
                "Three-piece shaker",
                "Paris shaker",
                "Boston shaker",
                "Cocktail Shaker",
                "Three-piece shaker"
        ));
        questions.put(25, new Question(
                25,
                5,
                5,
                "What is the ideal garnish for a margarita?",
                "Salt rim",
                "Lime wedge",
                "Lime peel",
                "Mint sprig",
                "Salt rim"
        ));
        questions.put(26, new Question(
                26,
                6,
                1,
                "Why do we stir drinks with ice?",
                "To achieve dilution while combining the ingredients",
                "To make the drink cold",
                "To achieve dilution",
                "To combine the ingredients",
                "To achieve dilution while combining the ingredients"
        ));
        questions.put(27, new Question(
                27,
                6,
                2,
                "What bar tool is used when churning?",
                "Bar spoon",
                "Mixing glass",
                "Muddler",
                "Bar spoon",
                "Juicer"
        ));
        questions.put(28, new Question(
                28,
                6,
                3,
                "What is the technical term for shaking a cocktail without ice",
                "Dry shake",
                "Wet shake",
                "Dry shake",
                "Dirty shake",
                "Clean shake"
        ));
        questions.put(29, new Question(
                29,
                6,
                4,
                "What is the best way to strain a sour?",
                "Wet shake with all ingredients, double strain, dry shake, pour all contents into glass",
                "Wet shake with all ingredients, double strain, dry shake, pour all contents into glass",
                "Dry shake with all ingredients, single strain, wet shake, fine strain into glass",
                "Wet shake with all ingredients, single strain, dry shake, fine strain into glass",
                "Dry shake with all ingredients, double strain, wet shake, pour all contents into glass"
        ));
        questions.put(30, new Question(
                30,
                6,
                5,
                "When shaking a sour, what is it that you are trying to achieve?",
                "All of the above",
                "Cooling the drink",
                "Aerating the drink",
                "Combining the ingredients",
                "All of the above"
        ));
    }
}
