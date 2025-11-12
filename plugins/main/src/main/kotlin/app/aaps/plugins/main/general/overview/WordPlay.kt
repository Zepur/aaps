package app.aaps.plugins.main.general.overview

class WordPlay {

        fun createSentence(): String {
            val transVerb = getTransitiveVerb()
            val transVerb2 = getTransitiveVerb()
            val badAdj = getBadAdj()
            val goodAdj = getGoodAdj()
            var (article, nounSingle) = getNounSingleton()
            var (article2, nounSingle2) = getNounSingleton()
            val articleRandom = listOf(article, "the").random()
            val (verbSingle, nounMulti) = getVerbSingle()
            val setup1 = "${getStarterWord()} ${getAdjective()} ${getNoun()} $transVerb, ${getInterimWord()} ${getNoun()} $transVerb2"
            val setup2 = "${getStarterWord()} $articleRandom ${getAdjective()} $nounSingle ${getAdverb()} $verbSingle$nounMulti, ${getInterimWord()} ${getNoun()} $transVerb2"
            val setup3 = "be ${getDojective()} about ${getAdjective()} ${getNoun()}"
            val setup4 = "$articleRandom $nounSingle can turn ${getNoun()} into ${getNoun()}"
            val setup5 = "$articleRandom $nounSingle is what ${getNoun()} need in order to $transVerb2"
            val setup6 = "$nounSingle ${verbSingle.trim()} no ${getNounSingleton().second}, ${getNounSingleton().second} ${verbSingle.trim()} no ${getNounSingleton().second}"
            val setup7 = "${getReciprStart()} when $article $nounSingle and $article2 $nounSingle2 ${getRecipVerb()}. ${getReaction()}"
            val setup8 = "${getReciprStart()} when ${getNounAmount()} ${getNoun()} and $article2 $nounSingle2 ${getRecipVerb()}. ${getReaction()}"
            val setup9 = "if you don't want to be ${getBadVerb()}, it ${getModalVerb()} help if you are ${getGoodVerb()}"
            val setup10 = "just because it's $badAdj to be $goodAdj does not mean it is $goodAdj ot be $badAdj"
            return listOf(setup10).random()
        }

    fun getBadAdj(): String {
        val wordList: List<String> = listOf(
            "unfriendly",
            "distant",
            "weak",
            "pathetic",
            "cringe",
            "disgusting",
            "rude",
            "awful",
            "complicated",
            "stupid",
            "dumb",
            "nasty",
            "bad",
            "dreadful",
            "pointless",
            "awkward",
            "deceitful",
            "hypocritical",
            "irritating",
            "reckless",
            "pessimistic",
            "unreliable",
            "vain",
            "spiteful",
            "mean",
            "selfish",
            "rash"
        )
        return wordList.random()
    }
    fun getGoodAdj(): String {
        val wordList: List<String> = listOf(
            "nice",
            "okay",
            "cool",
            "friendly",
            "elegant",
            "stylish",
            "amusing",
            "fun",
            "clever",
            "smart",
            "brave",
            "tactful",
            "regular",
            "polite",
            "ordinary",
            "wise",
            "wise",
            "sensible",
            "cordial",
            "cute",
            "charming",
            "fair"
        )
        return wordList.random()
    }

    fun getBadVerb(): String {
        val wordList: List<String> = listOf(
            "sodomized",
            "abused",
            "taken advantage of",
            "kidnapped",
            "assaulted",
            "beaten",
            "thrown out of a window",
            "murdered",
            "stabbed",
            "hit with a bat",
            "run over",
            "homeless",
            "poor",
            "ugly",
            "ignored",
            "downvoted",
            "overlooked",
            "picked last",
            "eating alone"
        )
        return wordList.random()
    }

    fun getGoodVerb(): String {
        val wordList: List<String> = listOf(
            "funny",
            "friendly",
            "generous",
            "rich",
            "kind",
            "intelligent",
            "Norwegian",
            "not Swedish",
            "charming",
            "fast",
            "agile",
            "prosperous",
            "polite",
            "powerful",
            "really angry",
            "clever",
            "open minded",
            "a virgin",
            "in a helicopter",
            "modest",
            "loyal",
            "loving",
            "#winning",
            "thoughtful",
            "a man",
            "breedable",
            "polyamorous",
            "not on reddit",
            "fertile"
        )
        return wordList.random()
    }

    fun getModalVerb(): String {
        val wordList: List<String> = listOf(
            "can",
            "may",
            "must",
            "shall",
            "will",
            "could",
            "might",
            "should",
            "would",
            "have to"
        )
        return wordList.random()
    }

    fun getNounAmount(): String {
        val wordList: List<String> = listOf("two", "three", "five thousand", "too many", "a lot of", "a few", "some", "all of the")
        return wordList.random()
    }

    fun getReciprStart(): String {
        val wordList: List<String> = listOf(
            "everything turns ${getAdjective()}", "everything sucks", "nothing works", "no one cares about being ${getAdjective()}", "no one is safe", "i hate it", "i love it", "${getNoun()} cry", "only birds notice"
        )
        return wordList.random()
    }

    fun getRecipVerb(): String {
        val wordList: List<String> = listOf(
            "argue",
            "break up",
            "coexist",
            "cooperate",
            "crawl over each other",
            "cuddle",
            "date",
            "debate",
            "embrace",
            "entwine",
            "exchange",
            "face off",
            "fall in love",
            "feud",
            "fight",
            "get married",
            "get together",
            "hug",
            "intersect",
            "kiss",
            "marry",
            "meet",
            "reunite",
            "rhyme",
            "sleep together",
            "speak",
            "unite",
            "wed",
            "wrestle"
        )
        return wordList.random()
    }

    fun getReaction(): String {
        val wordlist: List<String> = listOf(
            "disgusting", "whoop whoop", "that's racist", "super duper gay", "be warned", "frfr no cap brap brap on stack on dog", "shit that's so real", " - michael scott", "fun times", "well job"
        )
        return wordlist.random()
    }

    fun getNounSingleton(): Pair<String, String> {
        val wordList: List<Pair<String, String>> = listOf(
            Pair("a", "perspective"),
            Pair("an", "elephant"),
            Pair("a", "government"),
            Pair("a", "thing"),
            Pair("a", "femininity"),
            Pair("a", "perversion"),
            Pair("a", "kick"),
            Pair("some", "cocaine"),
            Pair("a", "cruelty"),
            Pair("an", "armageddon"),
            Pair("a", "gamble"),
            Pair("a", "lesbian"),
            Pair("a", "journalist"),
            Pair("a", "liar"),
            Pair("a", "nerd"),
            Pair("an", "opinion"),
            Pair("an", "onion"),
            Pair("a", "plate"),
            Pair("an", "opposition"),
            Pair("a", "bear"),
            Pair("a", "fish"),
            Pair("a", "freak"),
            Pair("a", "human"),
            Pair("a", "girl"),
            Pair("a", "man"),
            Pair("a", "boy"),
            Pair("a", "developer"),
            Pair("a", "bird"),
            Pair("a", "woman"),
            Pair("an", "alien"),
            Pair("a", "lady"),
            Pair("a", "cat"),
            Pair("a", "monster"),
            Pair("a", "tail"),
            Pair("a", "beer"),
            Pair("a", "tiger"),
            Pair("a", "fucker"),
            Pair("a", "reject"),
            Pair("a", "gym-bro"),
            Pair("a", "salmon"),
            Pair("a", "line"),
            Pair("a", "marjiuana"),
            Pair("a", "drug"),
            Pair("a", "friend"),
            Pair("an", "enemy"),
            Pair("a", "weapon"),
            Pair("a", "movie"),
            Pair("a", "turtle"),
            Pair("a", "hat"),
            Pair("a", "washing machine"),
            Pair("a", "waterbed"),
            Pair("a", "wall"),
            Pair("a", "house"),
            Pair("a", "stone"),
            Pair("a", "rock"),
            Pair("a", "diamond")
        )
        return wordList.random()
    }

    fun getDojective(): String {
        val wordList: List<String> = listOf(
            "jolly", "joyous", "happy", "concerned", "fearful", "angry", "upset", "outraged", "resourceful"
        )
        return wordList.random()
    }

    fun getStarterWord(): String {
        val wordList: List<String> = listOf(
            "Breaking news!", "This just in:", "Did you know", "For the first time ever", "And now,", "Well...", ""
        )
        return wordList.random()
    }

    fun getInterimWord(): String {
        val wordList: List<String> = listOf(
            "so", "but", "and", "therefore", "hence", "how", "yet", "unfortunately", "however"
        )
        return wordList.random()
    }

    fun getNoun(): String {
        val wordList: List<String> = listOf(
            "perspectives",
            "elephants",
            "governments",
            "things",
            "femininities",
            "perversions",
            "kicks",
            "lines of cocaine",
            "cruelties",
            "armageddons",
            "gambles",
            "lesbians",
            "journalists",
            "liars",
            "nerds",
            "opinions",
            "onions",
            "plates",
            "oppositions",
            "bears",
            "fish",
            "humans",
            "girls",
            "men",
            "boys",
            "developers",
            "birds",
            "women",
            "freaks",
            "people from Belgium",
            "milfs",
            "aliens",
            "ladies",
            "cats",
            "monsters",
            "tails",
            "beer",
            "tigers",
            "fuckers",
            "rejects",
            "gym-bros",
            "salmons",
            "lines",
            "marjiuanas",
            "drugs",
            "friends",
            "enemies",
            "weapons",
            "movies",
            "turtles",
            "hats",
            "washing machines",
            "waterbeds",
            "walls",
            "houses",
            "stones",
            "rocks"
        )
        return wordList.random()
    }

    fun getTransitiveVerb(): String {
        val wordList: List<String> = listOf(
            "shift",
            "reduce",
            "opt for",
            "pursue",
            "reinforce",
            "convict",
            "generate",
            "copy",
            "communicate with",
            "curl",
            "attain",
            "purchase",
            "meet",
            "rebuild",
            "support",
            "plead with",
            "multiply",
            "pop",
            "give",
            "exclude",
            "drive",
            "question",
            "dictate",
            "associate",
            "tend to",
            "admire",
            "argue with",
            "borrow from",
            "calm",
            "feed",
            "activate",
            "draft",
            "heat",
            "slay ",
            "dwell on ",
            "listen to ",
            "jump around ",
            "belittle ",
            "applaud ",
            "date ",
            "try to kiss ",
            "kidnap ",
            "eat ",
            "dream about "
        )
        return wordList.random()
    }

    fun getVerbSingle(): Pair<String, String> {
        val wordList: List<Pair<String, String>> = listOf(
            Pair("slays ", getAdjective() + " " + getNoun()),
            Pair("dwells on ", getAdjective() + " " + getNoun()),
            Pair("listens to ", getAdjective() + " " + getNoun()),
            Pair("frolics", ""),
            Pair("jumps around ", getNoun()),
            Pair("belittles ", getAdjective() + " " + getNoun()),
            Pair("applauds ", getAdjective() + " " + getNoun()),
            Pair("dates ", getNoun()),
            Pair("runs", ""),
            Pair("moves", ""),
            Pair("leaves", ""),
            Pair("shoves", ""),
            Pair("helps", ""),
            Pair("tries to kiss ", getAdjective() + " " + getNoun()),
            Pair("kidnaps ", getNoun()),
            Pair("eats ", getAdjective() + " " + getNoun()),
            Pair("dreams about ", getNoun())
        )
        return wordList.random()
    }

    fun getAdverb(): String {
        val wordList: List<String> = listOf(
            "abruptly",
            "angrily", "accordingly",
            "additionally",
            "begrudgingly",
            "briefly",
            "sloppily",
            "while high",
            "certainly",
            "conversely",
            "finally",
            "well",
            "slowly",
            "tonight",
            "badly",
            "lately",
            "sweetly",
            "finally",
            "every Friday",
            "soon",
            "so damn fast",
            "passionately"
        )
        return wordList.random()
    }

    fun getAdjective(): String {
        val wordList: List<String> = listOf(
            "attractive",
            "bald",
            "beautiful",
            "retarded",
            "gay",
            "inbred",
            "chubby",
            "clean",
            "complex",
            "dazzling",
            "drab",
            "elegant",
            "fancy",
            "fit",
            "sussy",
            "flabby",
            "glamorous",
            "gorgeous",
            "handsome",
            "unlucky",
            "homeless",
            "long",
            "magnificent",
            "muscular",
            "plain",
            "plump",
            "quaint",
            "scruffy",
            "shapely",
            "resourceful",
            "short",
            "skinny",
            "stocky",
            "ugly",
            "unkempt",
            "unsightly",
            "ashy",
            "icy",
            "mango-colored",
            "fish-textured",
            "white",
            "alive",
            "better",
            "careful",
            "clever",
            "dead",
            "easy",
            "famous",
            "gifted",
            "hallowed",
            "helpful",
            "important",
            "inexpensive",
            "mealy",
            "mushy",
            "odd",
            "poor",
            "powerful",
            "rich",
            "shy",
            "tender",
            "unimportant",
            "uninterested",
            "vast",
            "wrong"
        )
        return wordList.random()
    }

}