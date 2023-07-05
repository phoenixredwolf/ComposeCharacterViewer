package com.example.composecharacterviewer.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharacterResult(
    @Json(name = "Abstract")
    val `abstract`: String = "",
    @Json(name = "AbstractSource")
    val abstractSource: String = "", // Wikipedia
    @Json(name = "AbstractText")
    val abstractText: String = "",
    @Json(name = "AbstractURL")
    val abstractURL: String = "", // https://en.wikipedia.org/wiki/The_Simpsons_characters
    @Json(name = "Answer")
    val answer: String = "",
    @Json(name = "AnswerType")
    val answerType: String = "",
    @Json(name = "Definition")
    val definition: String = "",
    @Json(name = "DefinitionSource")
    val definitionSource: String = "",
    @Json(name = "DefinitionURL")
    val definitionURL: String = "",
    @Json(name = "Entity")
    val entity: String = "",
    @Json(name = "Heading")
    val heading: String = "", // The Simpsons characters
    @Json(name = "Image")
    val image: String = "",
    @Json(name = "ImageHeight")
    val imageHeight: Int = 0, // 0
    @Json(name = "ImageIsLogo")
    val imageIsLogo: Int = 0, // 0
    @Json(name = "ImageWidth")
    val imageWidth: Int = 0, // 0
    @Json(name = "Infobox")
    val infobox: String = "",
    @Json(name = "meta")
    val meta: Meta = Meta(),
    @Json(name = "Redirect")
    val redirect: String = "",
    @Json(name = "RelatedTopics")
    val relatedTopics: List<RelatedTopic> = listOf(),
    @Json(name = "Results")
    val results: List<Any> = listOf(),
    @Json(name = "Type")
    val type: String = "" // C
) {
    @JsonClass(generateAdapter = true)
    data class Meta(
        @Json(name = "attribution")
        val attribution: Any? = null, // null
        @Json(name = "blockgroup")
        val blockgroup: Any? = null, // null
        @Json(name = "created_date")
        val createdDate: Any? = null, // null
        @Json(name = "description")
        val description: String = "", // Wikipedia
        @Json(name = "designer")
        val designer: Any? = null, // null
        @Json(name = "dev_date")
        val devDate: Any? = null, // null
        @Json(name = "dev_milestone")
        val devMilestone: String = "", // live
        @Json(name = "developer")
        val developer: List<Developer> = listOf(),
        @Json(name = "example_query")
        val exampleQuery: String = "", // nikola tesla
        @Json(name = "id")
        val id: String = "", // wikipedia_fathead
        @Json(name = "is_stackexchange")
        val isStackexchange: Any? = null, // null
        @Json(name = "js_callback_name")
        val jsCallbackName: String = "", // wikipedia
        @Json(name = "live_date")
        val liveDate: Any? = null, // null
        @Json(name = "maintainer")
        val maintainer: Maintainer = Maintainer(),
        @Json(name = "name")
        val name: String = "", // Wikipedia
        @Json(name = "perl_module")
        val perlModule: String = "", // DDG::Fathead::Wikipedia
        @Json(name = "producer")
        val producer: Any? = null, // null
        @Json(name = "production_state")
        val productionState: String = "", // online
        @Json(name = "repo")
        val repo: String = "", // fathead
        @Json(name = "signal_from")
        val signalFrom: String = "", // wikipedia_fathead
        @Json(name = "src_domain")
        val srcDomain: String = "", // en.wikipedia.org
        @Json(name = "src_id")
        val srcId: Int = 0, // 1
        @Json(name = "src_name")
        val srcName: String = "", // Wikipedia
        @Json(name = "src_options")
        val srcOptions: SrcOptions = SrcOptions(),
        @Json(name = "src_url")
        val srcUrl: Any? = null, // null
        @Json(name = "status")
        val status: String = "", // live
        @Json(name = "tab")
        val tab: String = "", // About
        @Json(name = "topic")
        val topic: List<String> = listOf(),
        @Json(name = "unsafe")
        val unsafe: Int = 0 // 0
    ) {
        @JsonClass(generateAdapter = true)
        data class Developer(
            @Json(name = "name")
            val name: String = "", // DDG Team
            @Json(name = "type")
            val type: String = "", // ddg
            @Json(name = "url")
            val url: String = "" // http://www.duckduckhack.com
        )

        @JsonClass(generateAdapter = true)
        data class Maintainer(
            @Json(name = "github")
            val github: String = "" // duckduckgo
        )

        @JsonClass(generateAdapter = true)
        data class SrcOptions(
            @Json(name = "directory")
            val directory: String = "",
            @Json(name = "is_fanon")
            val isFanon: Int = 0, // 0
            @Json(name = "is_mediawiki")
            val isMediawiki: Int = 0, // 1
            @Json(name = "is_wikipedia")
            val isWikipedia: Int = 0, // 1
            @Json(name = "language")
            val language: String = "", // en
            @Json(name = "min_abstract_length")
            val minAbstractLength: String = "", // 20
            @Json(name = "skip_abstract")
            val skipAbstract: Int = 0, // 0
            @Json(name = "skip_abstract_paren")
            val skipAbstractParen: Int = 0, // 0
            @Json(name = "skip_end")
            val skipEnd: String = "", // 0
            @Json(name = "skip_icon")
            val skipIcon: Int = 0, // 0
            @Json(name = "skip_image_name")
            val skipImageName: Int = 0, // 0
            @Json(name = "skip_qr")
            val skipQr: String = "",
            @Json(name = "source_skip")
            val sourceSkip: String = "",
            @Json(name = "src_info")
            val srcInfo: String = ""
        )
    }

    @JsonClass(generateAdapter = true)
    data class RelatedTopic(
        @Json(name = "FirstURL")
        val firstURL: String = "", // https://duckduckgo.com/Apu_Nahasapeemapetilan
        @Json(name = "Icon")
        val icon: Icon = Icon(),
        @Json(name = "Result")
        val result: String = "", // <a href="https://duckduckgo.com/Apu_Nahasapeemapetilan">Apu Nahasapeemapetilan</a><br>Apu Nahasapeemapetilan is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, "Thank you, come again".
        @Json(name = "Text")
        val text: String = "" // Apu Nahasapeemapetilan - Apu Nahasapeemapetilan is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, "Thank you, come again".
    ) {
        @JsonClass(generateAdapter = true)
        data class Icon(
            @Json(name = "Height")
            val height: String = "",
            @Json(name = "URL")
            val uRL: String = "",
            @Json(name = "Width")
            val width: String = ""
        )
    }
}