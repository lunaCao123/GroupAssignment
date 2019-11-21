package com.example.barbootcamp.model;

import com.example.barbootcamp.R;
import com.example.barbootcamp.model.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopicsDB {

    public static Topic getTopicById(int topicNo) {
        return topics.get(topicNo);
    }

    public static ArrayList<Topic> getAllTopics() {
        return new ArrayList<Topic>((List) Arrays.asList(topics.values().toArray()));
    }

    private static final HashMap<Integer, Topic> topics = new HashMap<>();

    static {
        topics.put(1, new Topic(
                1,
                "1",
                "Beer and Wine",
                "Beginner",
                "Beer is one of the oldest and most widely consumed alcoholic drinks in the world. It is also the third most popular drink overall, after water and tea. Beer is brewed from cereal grains - mostly from malted barley, although wheat, maize, and rice are also used. Most modern beer is brewed with hops, which adds bitterness and other flavours and act as a natural preservative and stabilizing agent. Other flavouring agents such as gruit, herbs, or fruits may be included or used instead of hops. \n " +
                        "\n" +
                        "When talking about beer, there are two main categories: Lager and Ale. The big difference between is the strain of yeast used in each. When wort (the sugary liquid of water and malts) is turned into beer it uses yeast to essentially eat the sugars and in turn burp out carbonation bubbles and alcohol. For ales this activity (fermentation) takes place at the top of the fermentation tank, in warm conditions (18-22ºC) using an ale yeast which loves the warm temperatures. For lagers the same activity takes place at the bottom of the tank, in cool conditions (less than 12ºC) using a lager yeast which prefers the cool temperatures to eat the sugars. \n " +
                        "\n" +
                        "Ales typically have much greater flavour profiles than lagers so it does make sense that in the craft beer category, where more flavoursome beers are sought, that ales are the more common style brewed. \n",
                "There are many beers that are popular and attract a certain type of drinker. \n" +
                        "\n" +
                        "Indian Pale Ales, better known as IPAs, are one of the most popular styles of beer in the craft brewing scene today. Typically, IPAs have a medium amber colour and feature a very bitter flavour. To make the bitterness more palatable, many brewers add citrus or herbal tones to the beer. Because of the sheer variety of IPAs on the market, there are no hard and fast rules when it comes to food pairings. But generally, they go well with smoky flavours, such as steak, mexican foods and barbequed food. \n" +
                        "\n" +
                        "Wheat beers are brewed with a mixture of wheat and barley grains, which gives the beer smoother texture and lighter carbonation than other styles. The wheat itself doesn't add much flavor, so many brewers add citrus and other fruity flavourings to the beer. Wheat beers are very versatile, and you can pair them with a number of foods, such as spicy noodles, salads and even fruit tarts. \n" +
                        "\n" +
                        "Amber ales are characterized by medium mouthfeel and colours that range from amber to a deep reddish-gold. These beers have strong flavours of malt, and there are notes of sweet caramel that complement the roasted malt taste. But, these beers do not have an overpoweringly sweet flavour, and many amber ales have a dry and crisp finish. Due to this, they are excellent for cleansing the palate after foods such as pizza, brisket and even jerk chicken. \n" +
                        "\n" +
                        "Porters originated in London, and the original variety were dark and strong. They are milder now and come in a variety of styles and flavours, but they kept their signature dark colour, toasty aroma and roasted flavour. They have a rich, deep flavour and pair best with foods that have a similar texture, such as lobster, crab, and game meats. \n" +
                        "\n" +
                        "Stouts are best known for their black colour and dark, roasted flavour similar to porters. However they are not necessarily high in alcohol content, bitterness or flavour, and tend to be milder than a porter. Because stouts have a chocolate flavour, they are perfect for pairing with desserts such as truffles, chocolate mousse and coffee-flavoured desserts. \n",
                "Wine is made from fermented grape juice. Grapes are picked, crushed and placed in buckets or vats to ferment. The process of fermentation turns the natural sugars in the grape juice into alcohol. Fermentation can occur naturally, but sometimes winemakers add yeast to help control the process. The crushed grapes are put through a press, which removes the skins and other sediment. \n" +
                        "\n" +
                        "To make white wine, grapes are pressed before fermentation, and the skins, seeds and stems are removed prior. Red wine is usually pressed after fermentation, with the stems, skin and seeds still in tact. The grape skins lend the wine its pigment, as well as many of the distinctive health compounds found in red wine. After this step, the wine is aged in stainless steel or oak barrels until it's ready to be bottled. \n" +
                        "\n" +
                        "While red varietals are used to make red wine, white wine can actually be made from red or white grapes. For instance, traditional French Champagne is made with the red Pinot Noir grape. \n" +
                        "\n" +
                        "Many countries produce wine. Some of the main wine-growing regions are in France, Italy, Spain, Chile, South Africa, Australia and California in the US. \n" +
                        "\n" +
                        "While most regions grow several types of grape varietals, some places are particularly known for one or two, such as Napa Valley Chardonnay, Spanish Tempranillo and South African Chenin Blanc. \n" +
                        "\n" +
                        "Research has found that drinking red wine may have a protective effect on the cardiovascular system. In fact, it has been linked to a 30% lower risk of dying from heart disease. This is important to know if you will be drinking a lot of it, or trying to sell it! \n",
                R.drawable.beerandwine,
                "Beer and Wine Quiz"
        ));
        topics.put(2, new Topic(
                1,
                "2",
                "Vodka, Gin and Whiskey",
                "Intermediate",
                "Vodka, the crystal clear spirit, is simply a distilled spirit that's made from water and ethanol. Vodka is fermented, distilled and filtered, and can be made from pretty much anything that is able to go through that process and end up making alcohol. \n " +
                        "\n" +
                        "This includes grains, grapes, sugar, fruits, corn, potatoes and even roots. The liquid is distilled to 90% or more alcohol by volume in order to remove all the potential smell and taste of whatever ingredients were used to produce it, before diluting the spirit to the much more palatable 40% alcohol. \n" +
                        "\n" +
                        "Although it's quite popular in the United States, vodka has been a staple in European countries like Russian, Ukraine, Belarus, Estonia, Latvia, Finland, Iceland, Norway, Poland and the Czech Republic for centuries now. \n" +
                        "\n" +
                        "Vodka is an extremely versatile spirit, with many different uses. Vodka can be applied to the preferences of the wide range of customer's palettes. Thus, it is known as the water of spirits. \n" +
                        "\n" +
                        "The Moscow Mule (ginger beer, vodka and lime juice) is by far one of the most requested vodka cocktails by bartenders. ",
                "Most of us love a good Gin & Tonic, but there's so much to learn about this historic spirit. It's traditionally made in Europe, and it's characterized by the use of juniper as a flavouring; also known as a botanical. Juniper is supported by other botanical characters; traditionally coriander, cassia, licorice, orris and other herbs. \n " +
                        "\n" +
                        "Gin comes from the combination of alcohol typically fermented grain and a specific set of botanicals. The base spirit for gin is mostly grain, but some gin distillers use wheat-based spirit and others use barley, grapes, sugar and various other bases. It is made in the same way as vodka, but with the addition of the botanicals. Distilling gin is a process of extracting essential oils - not dissimilar to perfume making - and creating a clean, pure spirit. \n" +
                        "\n" +
                        "There are four main types of gin: London dry gin, Bathtub gin, Genever and Old Tom. London Dry has strict regulations about the way it is made. It cannot have any sugar added, has to be flavoured prevalently with juniper berries, and has to be at least 140 Proof after distillation. Only water can be added to bring down the alcohol content. Bathtub gin is a homemade gin made by simply infusing the grain spirit with spices, and is often made in bathtubs as the name suggests. Genever is the father of gin, made by distilling malt wine and then redistilling it with spices and sweetening it. Old Tom is Genever's successor, and was made sweeter and psicier to cover the bad taste of the poor-quality alcohol that was used to make it. \n" +
                        "\n" +
                        "Gin has always been a key cocktail ingredient since the birth of mixing drinks. Some famous favourites are the Vesper, Bees Knees, Negroni and the classic Martini. ",
                "Whisky ks a distilled spirit made from fermented grain mash, including corn rye, barley and wheat. After fermentation, the whisky is matured in barrels for several years. The most popular whisky producing countries are Canada, Scotland, Japan and the United States. \n" +
                        "\n" +
                        "The difference between whisky and whiskey is actually dependent on which part of the world the whisky is from. In the United States and Ireland, it's spelled with the e, and in Scotland, Japan and pretty much the rest of the world, it is spelled whisky. \n" +
                        "\n" +
                        "Single malt whisky accounts for most of the Scotch whisky produced and is made of one single type of malted grain, hence the name. Blended whisky, on the other hand, is created by mixing single malt whiskies from different distilleries to create one whisky. It's very common in Scotch, but can also be found in every other whisky-producing nation. The most well-known American style is bourbon. To count as bourbon, the whisky must be made from at least 51% corn. It also needs to be matured in first-use charred American oak casks. It doesn't have to be made in Kentucky. \n" +
                        "\n" +
                        "Ageing matters because much of the flavours associated with whisky comes from the caramelized, charred wood it's aged in. Most whiskies are aged for a minimum of three years, giving them its colour. Others can sit in a cask for decades, taking in more and more flavour the whole time. \n" +
                        "\n" +
                        "Most whiskies are distilled in a way that lend them to be enjoyed on their own, but bourbons pair very well with different colas and soda water and scotch mixes well with ginger ale and seltzers. Classic whisky cocktails include the Old Fashioned or a Whisky Sour. \n",
                R.drawable.vodka,
                "Vodka, Gin and Whisky Quiz"
        ));
        topics.put(3, new Topic(
                3,
                "3",
                "Rum, Tequila and Other Festive Spirits",
                "Intermediate",
                "Rum is the finest application of sugar cane known to man. It's made from a distillate of either the fermented juice of sugar cane, sugar cane syrup or sugar cane molasses. THe origins of rum lie in the Caribbean islands, where modern rum production got its start and where island nations continue to produce the majority of the world's sugar cane spirits. \n" +
                        "\n" +
                        "There is no standard for making rum. All you have to do is start with sugar cane! Of course, it has to go through the normal process of making a spirit: fermentation, distillation, aging and blending. But how these steps are done is up to the whim of the distiller. Most rum produced is made from molasses. Yeast and water are added to the base ingredient to start the fermentation process. Molasses allows you to make light rums, gold rums, dark rums, flavoured, spiced, etc. \n" +
                        "\n" +
                        "The part of the sugar cane used in the process may also determine which type of rum it is. Sugar cane juice is used to produce Cachaca, the Brazilian variation of rum, used to make Caipirinhas. There are many expressions of rum, including French style (Agricole/Rhum), Spanish/Puerto Rican (Ron), English, Jamaican and Black Strap. Each has its own particular recipe and nuances that make it different from the rest. \n" +
                        "\n" +
                        "The recent rebirth of Tiki within contemporary cocktail culture has helped catalyze a resurgence in mixing drinks with rum. Arguably the most common rum cocktail is the Daiquiri. Rum is also popular in drinks like a Mojito, Dark and Stormy, and even a Mai Tai. \n",
                "Tequila is a much more interesting spirit tham most have assumed from their days of doing many shots of the spirit in their earlier years and is more versatile than most imagine. It is distilled from the juice of blue agave plants grown in five specific regions in Mexico: in the highland Jalisco state and in limited areas in four states around the city of Tequila.  \n " +
                        "\n" +
                        " Tequila is made of the mature blue weber agave, which takes 8-12 years to become mature. Once they reach that point, they are then harvested by a jimador, who cuts all the sharp outer leaves off and creates large piles of the plant. The plants are then roasted or steamed to turn the starches and complex proteins into fermentable sugars. The plants are milled with a large stone to remove the pulp from the sweet juice.  \n" +
                        "\n" +
                        "There are three main types: blanco (white), reposado (rested) and anejo (aged). Generally, blanco is the lightest and brightest, with a clean, crisp sweetness and stronger agave character; reposado is darker and more flavourful, and anejo is the darkest, most robust and most complex, often with earthy vanilla, oak and whisky tasting notes from the aging process. \n" +
                        "\n" +
                        "Technically, there are only two variations of tequila: 100% agave and mixtos. As with bourbon, mixtos can contain no less than 51% agave, and the rest is made up of various sugars. The five bottled categories are Blanco (un-aged or slightly aged, white tequila), Oro (un-aged tequila that is flavoured with other adjuncts or mixed with aged tequila), Reposado (aged at least two months, but not more than a year), Anejo (aged at least a year, but no more than three) and Extra Anejo (aged at least 3 years). \n" +
                        "\n" +
                        "Tequila is extraordinarily versatile and just about any known cocktail can be converted into a tequila drink. They go well in Margarita and Paloma drinks, and cocktails made with strawberry, watermelon and other summer fruits also find their way into many drink menus. ",
                "Brandy is an unsweetened spirit that's made by fermenting and distilling fresh grape juice. It’s made all over the world, either unaged and coloured with caramel before bottling, or aged in wooden casks. The brandy category encompasses high-end historical brandies including Cognac, Armagnac and Spanish brandy, as well as pisco from Peru and Chile, and grappa or marc. \n " +
                        "\n" +
                        "Cognac is made in the Cognac region of France, north of Bordeaux. The sub-regions are Grande Champagne, Champagne, Borderies, Fins Bois, Bons Bois and Bois Communs. For Cognac, wine made mainly from Ugni Blanc grapes is double distilled in small copper pot stills heated by naked flames, and aged in the French Limousin oak barrels. VS Cognac must be aged a minimum of two years, VSOP a minimum of four years and XO a minimum of six years. \n" +
                        "\n" +
                        "Armagnac is produced in the Gascony region of France, south of Bordeaux. Armagnac production predates that of Cognac, but the region developed more slowly as transportation was not as advanced. Armagnac is aged mainly in French Limousin casks: VS for a minimum of one year, VSOP for a minimum of four years and XO for a minimum of five years. \n" +
                        "\n" +
                        "Pisco is produced in Chile and Peru from a distillate of aromatic grapes. Peruvians prefer to use a pot still, while Chileans like a continuous still. Pisco may be bottled unaged or lightly aged, and it's mainly designed to be enjoyed in cocktails like the Pisco Sour and Pisco punch. \n" +
                        "\n" +
                        "Vermouth is an aromatized wine flavoured with botanicals that may include flowers, plants, roots, seeds, bark spices and fortified with grape-based spirit. Depending on its style, vermouth may be served over ice with a citrus twist as an aperitif before a meal, or used in cocktails like the classic Martini or Negroni. In a way, vermouth is a wine flavoured with brandy! \n",
                R.drawable.tequila,
                "Rum, Tequila and Other Festive Spirits Quiz"
        ));
        topics.put(5, new Topic(
                5,
                "5",
                "Cocktail Equipment and Garnishes",
                "Advanced",
                "Being well equipped to make any drink is one of the basic steps in running a successful bar. This includes cocktails. By definition, a cocktail is an alcoholic drink consisting of a spirit or spirits mixed with other ingredients. However, to get started in cocktail making you need to know what tools are on offer for you to use, and when it is best to use each. \n " +
                        "\n" +
                        "The first category of equipment is fruit prep equipment. An example of one you already know is the chopping board, knife and juice squeezer. Ones you might have not used before include the muddler. Muddler's are used when it is needed to crush a whole fruit in order to extract its flavours. An example of where a muddler is used is when crushing lime wedges in a Caprioska. \n" +
                        "\n" +
                        "The second category of equipment is measurers. These are usually in the form of what are known in the industry as Jiggers. Jiggers typically have two ends: one end that measures 30ml of liquid, and the other that measures 15ml of liquid. 30ml is the standard pour for mixed drinks, which is why it is industry standard in Australia. The other end is typically of use when making cocktails, as different cocktails may require smaller measurements. Jiggers are not limited to this style, as some companies choose to produce larger jiggers for different purposes, some measuring up to 90ml. \n" +
                        "\n" +
                        "The third category is strainers. Strainers are used to filter out broken ice particles and juice pulp from drinks, whether they have been shaken or stirred. The first strainer is a fine strainer, which is used for drinks served \"up\", meaning without ice, typically after they have been shaken. It is necessary to fine strain a shaken cocktail, as the shaking process breaks down the ice in the shaker and leaves small, undesirable chips of ice in the drink. \n" +
                        "\n" +
                        "The second strainer is a hawthorn strainer, which has a spring inside it and is used atop a cocktail shaker to separate large ice particles from the liquid in the strainer. The hawthorne strainer is a favourite among bartenders, as it is easy to clean and holds onto the top of a shaker when straining liquid. It is typically used in conjunction with a fine strainer, as it holds back the majority of the solids in the shakern. \n " +
                        "\n" +
                        "The third strainer is the julep strainer, which is shaped like a shell and has large holes throughout it. This strainer is more difficult to use than the hawthorne due to the fact that it must sit inside a shaker when straining, meaning it has more use when straining items from a mixing glass than a shaker. These are typically used when straining a cocktail that has been stirred and not shaken. \n",
                "The vessel for which cocktails are made are far and wide, however there are 3 that are used most often; the mixing glass, the Three-Piece Shaker and the Boston Shaker. \n " +
                        "\n" +
                        "The mixing glass is used in order to achieve dilution when making a cocktail that is stirred. They are usually clear and ornate, with a pourer at the end. These are used to mix drinks such as a Negroni, Old Fashioned or a Manhattan. A bar spoon is usually required to mix the cocktail. They tend to be up to 30cm in length, and can hold up to 5ml of liquid within the spoon. \n" +
                        "\n" +
                        "The Three-Piece Shaker is the shaker that you would tend to find in people's homes and home bars due to their smaller size and simplicity of use. As the name suggests, it is composed of a base container, a strainer and a lid. The trick to using these shakers is that when closing it, put the strainer atop and then the lid, as the cold air of the ice in the shaker will help shut the lid and remove air from the shaker. While these shakers are nifty, they do not allow a lot of movement of the ice cubes throughout the shaker, meaning they are not ideal for cocktails requiring aeration; thus they are best for Margaritas and not so much for sours. \n" +
                        "\n" +
                        "The Boston Shaker is the favourite amongst professional bartenders due to its versatility and the ability to use it in the same way as a mixing glass and a Three-Piece shaker. It has one metal component and one glass component, and the shaker works by using force to secure the glass within the metal. The amount of space allowed by this type of shaker means it is great for aerating cocktails such as an Amaretto Sour and an Espresso Martini, and pretty much any shaken cocktail that you can think of. These tend to not be found within homes due to the fact that the layman person has difficulty in opening and closing this shaker, making a great cocktail made with one all the more special. \n",
                "Garnishing cocktails is an art within itself. They are not only decorative, but also add important flavour elements to the drink itself. Thus, preparation of them is important. \n " +
                        "\n" +
                        "Wedges of fruit are the most simple garnish to any drink. Lemons and limes are popular in mixed drinks like vodka, lime and sodas, and a gin and tonic. To properly cut a lemon or lime, you must first cut the ends of each to ensure that it appears more circular. Then, you slice from the top to the bottom, cutting the lime in half. This half is then cut into four wedges, or up to 6 for larger lemons. The key to preparing a lemon or lime is cleaning the white core from the wedge once it is cut. This is found at the end of the wedge, and removing it makes the wedge more aesthetic and easier to juice. This technique also can be used for oranges, grapefruits and other fruits. \n" +
                        "\n" +
                        "Making a fruit peel is the next type of garnish, and it tends to be more difficult to master. It involves using a fruit peeler or a knife to remove the peel of a fruit (orange is popular) and trimming it to make a pretty peel for the drink. The peel itself contains oils from the fruit skin that add a depth of flavour to the drink. Orange peels are often used in an Old Fashioned, and lemon peels are used in Dry Martinis to add a hint of citrus without actually incorporating the fruit to the drink. Peeling fruit takes practice, but the trick is to go through and remove the white pith from inside the fruit peel, as this adds bitterness. \n" +
                        "\n" +
                        "Mint sprigs or other sprigs of herbs can be used to garnish cocktails as well. Some gin fanatics like to use Thyme leaves to garnish gin cocktails, and mint sprigs are used as a garnish for Mojitos all the time, as they give a strong mint smell to the drink as the customer drinks it. Mint should be prepared with an ice bath to make it more rigid and keep it fresh. The ice bath also keeps the sprigs from going limp. \n" +
                        "\n" +
                        "Finally, salt rims are a classic garnish to a lot of variations of Margaritas. They add a salt element to a drink while not forcing that flavour into it, in case the customer does not wish to drink salt. To salt the rim of a glass, you must first run a lime wedge around the edge of the glass. Then, in a plate of salt, you roll the edges of the glass in it. Do NOT dip the top in! If you do, the salt will get in the drink, and makes it messy. Ideally, you only salt 75% of the glass so that you can drink the Margarita without salt if you choose. Finally, to ensure that there is not too much salt on the glass, tipping the glass upside down and tapping the bottom lightly will get the excess salt off the glass and out of the inside of the glass. But remember: this should be done before you fill the glass with the cocktail! \n",
                R.drawable.equipment,
                "Cocktail Equipment and Garnishes Quiz"
        ));
        topics.put(4, new Topic(
                5,
                "4",
                "Classic Cocktails",
                "Advanced",
                "The first two classic cocktails that you will learn are some that you have most definitely had before: the Whisky Sour and the Espresso Martini. Both are shaken cocktails and are insanely popular in Australia due to their clean taste and ability to be adapted into other variations. But we will only show you the original recipes. \n" +
                        "\n" +
                        "<\b>Espresso Martini<\b> \n" +
                        "\n" +
                        "- 45ml Vodka \n" +
                        "- 15ml Coffee Liqueur \n" +
                        "- 30ml Fresh Coffee \n" +
                        "- 10ml Sugar Syrup \n" +
                        "\n" +
                        "Place all ingredients into a Boston Shaker and fill the shaker with ice. Shake vigorously until shaker is cold and cocktail colour lightens. Double strain into a chilled cocktail glass. Garnish with 3 coffee beans. \n" +
                        "\n" +
                        "<\b>Whisky Sour<\b> \n" +
                        "\n" +
                        "- 60ml Blended whisky \n" +
                        "- 15ml egg white \n" +
                        "- 30ml lemon juice \n" +
                        "- 10ml sugar syrup \n" +
                        "- 4 dashes of Angostura Bitters (optional) \n" +
                        "\n" +
                        "Place all ingredients into a Boston Shaker and fill the shaker with ice. Wet shake, and then dry shake. Single strain into a double rocks glass and fill with ice. Garnish with an orange peel. \n ",

                "Margaritas are an all-time favourite of most people, as the flavour combination of tequila, lime and triple-sec is one that can't be beat when you are sitting by a pool. It screams tropical, fresh and fun, and can be mixed with a variety of flavours to make something completely new, such as strawberry. \n " +
                        "\n" +
                        "<\b>Margarita<\b>" +
                        "\n" +
                        "- 45ml Blanco Tequila \n" +
                        "- 15ml Triple Sec (e.g. Cointreau) \n" +
                        "- 30ml Fresh Lime Juice \n" +
                        "- 10ml sugar syrup (optional) \n" +
                        "\n" +
                        "Create a salt rim on a cocktail glass (preferably a coupette). Place all ingredients into a Three piece shaker and fill with ice. Shake and strain into the cocktail glass. \n" +
                        "\n" +
                        "Another variation of this classic is the Tommy's Margarita, which was designed in New York by a man named Tommy. The big difference is agave syrup; a sugar syrup made from the agave plant that tequila is made from. \n" +
                        "\n" +
                        "<\b>Tommy's Margarita<\b> \n" +
                        "\n" +
                        "- 60ml Reposado Tequila \n" +
                        "- 30ml Fresh lime juice \n" +
                        "- 15ml Agave Syrup \n" +
                        "\n" +
                        "Place all ingredients into a three piece shaker. Shake with ice and strain into a double rocks glass. Top with ice. Garnish with a lime wedge. \n",
                "The most popular stirred cocktails include the Old Fashioned and the Negroni. An Old Fashioned is essentially any bourbon or rye bourbon, stirred with a small quantity of sugar and angostura bitters. May have made variations but this is its true form. A Negroni has far less variation, and is a classic pre-dinner cocktail in Italy. \n" +
                        "\n" +
                        "<\b>Old Fashioned<\b> \n" +
                        "\n" +
                        "- 60ml Bourbon (preferably a good bourbon) \n" +
                        "- 5ml Sugar Syrup \n" +
                        "- 2 dashes of Angostura Bitters \n" +
                        "\n" +
                        "Place all ingredients into a mixing glass with ice. Stir until the glass is cold and the drink is diluted to your preference. Single strain into a double rocks glass and top with one large ice cube. Garnish with an orange peel. \n" +
                        "\n" +
                        "<\b>Negroni<\b> \n" +
                        "\n" +
                        "- 30ml Dry Gin \n" +
                        "- 30ml Campari \n" +
                        "- 30ml Sweet Vermouth \n" +
                        "\n" +
                        "Place all ingredients into a mixing glass with ice. Stir until the glass is cold and the drink is diluted to your preference. Single strain into a double rocks glass and top with one large ice cube. Garnish with an orange wedge. \n ",
                R.drawable.cocktails,
                "Classic Cocktails Quiz"
        ));
        topics.put(6, new Topic(
                6,
                "6",
                "Cocktail Making Techniques",
                "Advanced",
                "There are some terms that you may have come across when reading through the cocktail specs we provided to you, and your confusion is justified. There are very specific techniques that must be learned by any aspiring bartender that allow for the best cocktails to be made. \n " +
                        "\n" +
                        "The first method you would have come across is the wet shake. A wet shake is where you shake a cocktail in a shaker with ice. The ice is what makes it wet! Shaking a cocktail with ice both cools down the drink and ensures that all its components are incorporated together. A wet shake is most crucial when combining fruit juice with alcohol, as stirring the drink alone will not ensure that the juice is well incorporated (it needs a bit of friction). You would typically shake with ice until the shaker is too cold to hold, meaning that the glass might frost or even have ice forming on the outside, as you would want to achieve when shaking an Espresso Martini. \n" +
                        "\n" +
                        "The dry shake is exactly what you think it is: shaking a cocktail without ice. A dry shake does not have the benefit of cooling down the cocktail, however it allows for air bubbles to form and for foam to appear. You would typically use a dry shake along with a wet shake to activate egg whites in a cocktail that creates the foam you love in Whisky Sours. \n" +
                        "\n" +
                        "Typically you would prefer to use a larger shaker when performing a dry shake, due to the fact that the liquid would have more room to move around. Thus, whenever a cocktail must have a wet and dry shake, you would typically shake the cocktail with ice, then strain the liquid back into one of the halves of the shaker, discard the ice and shake without ice. This method would allow for both air bubbles to form and for the drink to be cooled down. \n" +
                        "\n" +
                        "Another technique that some like to use with their dry shake is to add a single cube of ice to the shaker when shaking it, as this ice cube acts as a whisk that further combines the drink without reducing the ability to aerate it.\n",
                "The next techniques you will learn will be stirring, muddling and churning. As straight-forward as it sounds, the ideal way to perform both techniques is with a medium level of force. \n"  +
                        "\n" +
                        "We stir drinks with ice when they typically do not require too much vigor to incorporate the ingredients. An old fashioned typically has no citrus components, and the process of shaking the cocktail would bruise the bourbon. You also need to consider the fact that Old Fashioneds may be made with very expensive whisky, and shaking them would dilute them far too much for them to be enjoyable. \n" +
                        "\n" +
                        "To stir a cocktail, you must place all ingredients into the mixing glass and fill the glass right up to the top with ice. When you stir the drink with the bar spoon, you want the bar spoon to be lodged into an ice cube as close to the edge of the glass as possible, and to essentially trace the edges of the mixing glass with the spoon, having the ice move as one large block. You shouldn't be able to hear it! This allows the alcohol to move between the ice cubes, slowly incorporating the ingredients and diluting the drink. \n" +
                        "\n" +
                        "Muddling is used to extract juices from fruit, such as limes and cucumbers. It's a lot like using a Mortar and Pestle, except within a shaker or a glass. When muddling, you want to press down on the fruit that has been cut, and not provide too much force. Not enough force will mean you don't get any juice out, but too much force means that you may extract some bitter oils from within the fruit's white pith that make a cocktail bitter. The beauty of muddling is that you can extract the good oils that provide a nice smell to the cocktail, but there's no need to over-do it. \n" +
                        "\n" +
                        "Churning is a very simple process. It is where you use a bar spoon to mix ingredients within a glass. This is used mostly for cocktails featuring crushed ice, as it means that you can incorporate ingredients using the ice, while also making sure that the profile of the drink is present throughout the entire glass.. Crushed ice is great for serving drinks, but it can be difficult to manoeuver when in the process of making a cocktail like a Mojito. When churning with crushed ice, you typically add all ingredients into the glass and fill the glass halfway with ice. Using the bar spoon, you mix the fruit and liquid throughout the drink by working in an upwards motion, ensuring that all the fruit components are evenly distributed throughout the ice. After this is completed, you should garnish the drink and potentially top up the crushed ice. \n",
                "Finally, there is the art of straining the drink. Straining is separating ice or other particles from a liquid to prepare it to be served. This may be small shards of ice resulting from shaking a cocktail, or fruit seeds from a fruit puree used in a cocktail variation. Regardless, the presence of such smaller imperfections may ruin the cocktail experience for a person, and straining can be crucial. \n" +
                        "\n" +
                        "A single strain is where you only remove the large chunks of ice from a drink, using a strainer with larger holes. This can be used when shaking or stirring a cocktail. Typically, you would single strain a stirred cocktail as the lack of fruit and smaller ice shards would mean it is far less likely to have smaller particles present within the body of the drink. You may also want to single strain a shaken cocktail if it contains particles that you do wish to keep in the drink, such as mint leaves or strawberry pulp. \n" +
                        "\n" +
                        "A double strain is where you follow a single strain with one using a finer sieve. This is used for shaken drinks where you do not wish to keep the smaller particles, such as in a shaken Martini or a Margarita. Fine straining the drink ensures a much cleaner finish, particularly when shaking a cocktail that is served without ice. It is almost never necessary to double strain a stirred cocktail. \n" +
                        "\n" +
                        "With double straining, there is the risk however of removing air bubbles that you worked to create in drinks such as whisky sours. For the ideal straining of a sour, you must first shake all ingredients with ice in a shaker, then double strain back into the strainer and discard the ice. Follow this by dry shaking the cocktail, and then pour the entire contents of the shaker into a serving glass. This ensures that the drink is incorporated, cold, foamy and ice chip free. :) \n",
                R.drawable.oldfashioned,
                "Cocktail Making Techniques Quiz"
        ));
    }
}
