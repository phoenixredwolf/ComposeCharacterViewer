package com.example.composecharacterviewer.utility

import com.example.composecharacterviewer.data.model.CharacterResult

val mockCharacterResponse = CharacterResult(
    abstract = "",
    abstractSource = "Wikipedia",
    abstractText = "",
    abstractURL = "https://en.wikipedia.org/wiki/The_Simpsons_characters",
    answer = "",
    answerType = "",
    definition = "",
    definitionSource = "",
    definitionURL = "",
    entity = "",
    heading = "The Simpsons characters",
    image = "",
    imageHeight = 0,
    imageIsLogo = 0,
    imageWidth = 0,
    infobox = "",
    redirect = "",
    relatedTopics = listOf(
        CharacterResult.RelatedTopic(
            firstURL = "https://duckduckgo.com/Apu_Nahasapeemapetilon",
            icon = CharacterResult.RelatedTopic.Icon(
                height = "",
                uRL = "/i/99b04638.png",
                width = ""
            ),
            result = "<a href=\"https://duckduckgo.com/Apu_Nahasapeemapetilon\">Apu Nahasapeemapetilon</a><br>Apu Nahasapeemapetilon is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, \"Thank you, come again\".",
            text = "Apu Nahasapeemapetilon - Apu Nahasapeemapetilon is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, \"Thank you, come again\"."
        ),
        CharacterResult.RelatedTopic(
            firstURL = "https://duckduckgo.com/Barney_Gumble",
            icon = CharacterResult.RelatedTopic.Icon(
                height = "",
                uRL = "/i/39ce98c0.png",
                width = ""
            ),
            result = "<a href=\"https://duckduckgo.com/Barney_Gumble\">Barney Gumble</a><br>Barnard Arnold \"Barney\" Gumble is a recurring character in the American animated TV series The Simpsons. He is voiced by Dan Castellaneta and first appeared in the series premiere episode \"Simpsons Roasting on an Open Fire\". Barney is the town drunk of Springfield and one of Homer Simpson's friends.",
            text = "Barney Gumble - Barnard Arnold \"Barney\" Gumble is a recurring character in the American animated TV series The Simpsons. He is voiced by Dan Castellaneta and first appeared in the series premiere episode \"Simpsons Roasting on an Open Fire\". Barney is the town drunk of Springfield and one of Homer Simpson's friends."
        ),
        CharacterResult.RelatedTopic(
            firstURL = "https://duckduckgo.com/Bart_Simpson",
            icon = CharacterResult.RelatedTopic.Icon(
                height = "",
                uRL = "",
                width = ""
            ),
            result = "<a href=\"https://duckduckgo.com/Bart_Simpson\">Bart Simpson</a><br>Bartholomew Jojo \"Bart\" Simpson is a fictional character in the American animated television series The Simpsons and part of the Simpson family. He is voiced by Nancy Cartwright and first appeared on television in The Tracey Ullman Show short \"Good Night\" on April 19, 1987.",
            text = "Bart Simpson - Bartholomew Jojo \"Bart\" Simpson is a fictional character in the American animated television series The Simpsons and part of the Simpson family. He is voiced by Nancy Cartwright and first appeared on television in The Tracey Ullman Show short \"Good Night\" on April 19, 1987."
        )
    ),
    results = listOf(),
    type = "C",
    meta = CharacterResult.Meta(
        attribution = null,
        blockgroup = null,
        createdDate = null,
        description = "Wikipedia",
        designer = null,
        devDate = null,
        devMilestone = "live",
        developer = listOf(
            CharacterResult.Meta.Developer(
                name = "DDG Team",
                type = "ddg",
                url = "http://www.duckduckhack.com"
            )
        ),
        exampleQuery = "nikola tesla",
        id = "wikipedia_fathead",
        isStackexchange = null,
        jsCallbackName = "wikipedia",
        liveDate = null,
        maintainer = CharacterResult.Meta.Maintainer(
            github = "duckduckgo"
        ),
        name = "Wikipedia",
        perlModule = "DDG::Fathead::Wikipedia",
        producer = null,
        productionState = "online",
        repo = "fathead",
        signalFrom = "wikipedia_fathead",
        srcDomain = "en.wikipedia.org",
        srcId = 1,
        srcName = "Wikipedia",
        srcOptions = CharacterResult.Meta.SrcOptions(
            directory = "",
            isFanon = 0,
            isMediawiki = 1,
            isWikipedia = 1,
            language = "en",
            minAbstractLength = "20",
            skipAbstract = 0,
            skipAbstractParen = 0,
            skipEnd = "0",
            skipIcon = 0,
            skipImageName = 0,
            skipQr = "",
            srcInfo = ""
        ),
        srcUrl = null,
        status = "live",
        tab = "About",
        topic = listOf("productivity"),
        unsafe = 0
    )
)