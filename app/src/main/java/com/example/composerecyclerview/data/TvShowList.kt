package com.example.composerecyclerview.data

import com.example.composerecyclerview.R
import com.example.composerecyclerview.model.TvShow

object TvShowList {

    val tvShows = listOf(

        TvShow(
            id = 1,
            name = "Lucifer",
            year = 2016,
            rating = 8.1,
            imageId = R.drawable.lucifer,
            overview = "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape."
        ),
        TvShow(
            id = 2,
            name = "Ragnarok",
            year = 2020,
            rating = 7.5,
            imageId = R.drawable.ragnarok,
            overview = "A small Norwegian town experiencing warm winters and violent downpours seems to be headed for another Ragnarök -- unless someone intervenes in time."
        ),
        TvShow(
            id = 3,
            name = "The Flash",
            year = 2014,
            rating = 7.7,
            imageId = R.drawable.flash,
            overview = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash."
        ),
        TvShow(
            id = 4,
            name = "The Good Doctor",
            year = 2017,
            rating = 7.1,
            imageId = R.drawable.doctor,
            overview = "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives"
        ),
        TvShow(
            id = 5,
            name = "Grey's Anatomy",
            year = 2005,
            rating = 7.5,
            imageId = R.drawable.anatomy,
            overview = "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital."
        ),
        TvShow(
            id = 6,
            name = "The Walking Dead",
            year = 2010,
            rating = 8.2,
            imageId = R.drawable.twd,
            overview = "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way."
        ),
        TvShow(
            id = 7,
            name = "Carnival Row",
            year = 2019,
            rating = 7.9,
            imageId = R.drawable.carnival,
            overview = "In a mystical and dark city filled with humans, fairies and other creatures, a police detective investigates a series of gruesome murders leveled against the fairy population. During his investigation, the detective becomes the prime suspect and must find the real killer to clear his name."
        ),
        TvShow(
            id = 8,
            name = "Legacies",
            year = 2018,
            rating = 7.4,
            imageId = R.drawable.legacies,
            overview = "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted."
        )

    )
}