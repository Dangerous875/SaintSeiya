package com.example.saintseiya.repositories

import com.example.saintseiya.R
import com.example.saintseiya.data.Attack
import com.example.saintseiya.data.Saint

class SaintService {
    companion object{
        val saintList = mutableListOf<Saint>()
        var currentSaint : Saint? = null

        init {
            saintList.add(Saint(
                    " Seiya de Pegasus","Pegasus" , "bronze" ,
                    "https://2.bp.blogspot.com/-EdKhj0Im53E/Vi1CpqgBpjI/AAAAAAAAFfA/zhgfTrIrJhw/s1600/Seiya-Pegaso%2B217.JPG",
                    "https://e0.pxfuel.com/wallpapers/605/928/desktop-wallpaper-results-for-saint-seiya-omega-1067.jpg",
                     R.raw.seiyatheme,
                     listOf(Attack(
                             "Pegasus Ryûsei Ken",
                             "Puño meteoro de Pegaso en inglés y japonés. Técnica que consiste en lanzar incontables puñetazos con forma de meteoro, los cuales superan la velocidad del sonido. Su poder y velocidad aumentan a medida que el Cosmo va creciendo",
                             R.raw.pegasusryuseiken,
                             "https://64.media.tumblr.com/e51d2c8ff007330f604329e0cec8d545/tumblr_plchpnArnN1saazguo1_540.gif"),
                         Attack(
                             "Pegasus Rolling Crash",
                             "Choque giratorio de Pegaso en inglés. Técnica con la cual se sujeta al enemigo desde atrás, mientras ambos se elevan hacia el cielo rotando de manera violenta, impactando el suelo con fuerza. ",
                             R.raw.pegasusrollingcrash,
                             "https://64.media.tumblr.com/7adca982a28a862d736c345dc3fa9cd3/tumblr_nqtr0pqGcO1qfcrcuo1_400.gifv"),
                         Attack(
                             "Pegasus Suisei Ken",
                             "Puño cometa de Pegaso en inglés y japonés. Técnica que consiste en concentrar los 100 meteoros en un único punto, como si se tratase de un cometa. El poder del golpe es 100 veces mayor que el de un meteoro.",
                             R.raw.pegasussuiseiken2,
                             "https://i.makeagif.com/media/7-08-2015/HX0bBL.gif")
                     )
                 )
            )

            saintList.add(Saint(
                "Shiryu de Dragón","Dragon" , "bronze" ,
                "https://static.wikia.nocookie.net/saintseiya/images/0/04/Drag%C3%B3n_Shiryuu.png/revision/latest/scale-to-width/360?cb=20171015140247&path-prefix=es",
                "https://w0.peakpx.com/wallpaper/553/97/HD-wallpaper-dragon-shiryu-dragon-shiryu.jpg",
                R.raw.shiryutheme,
                listOf(Attack(
                    "Rozan Shô Ryû Ha",
                    "Puño meteoro de Pegaso en inglés y japonés. Técnica que consiste en lanzar incontables puñetazos con forma de meteoro, los cuales superan la velocidad del sonido. Su poder y velocidad aumentan a medida que el Cosmo va creciendo",
                    R.raw.shiryu1,
                    "https://steamuserimages-a.akamaihd.net/ugc/948472629463670960/C6F62742C91A3A0EA02A03FF018B3D6D4FBCD6C9/?imw=5000&imh=5000&ima=fit&impolicy=Letterbox&imcolor=%23000000&letterbox=false"),
                    Attack(
                        "Rozan Kô Ryû Ha",
                        "Choque giratorio de Pegaso en inglés. Técnica con la cual se sujeta al enemigo desde atrás, mientras ambos se elevan hacia el cielo rotando de manera violenta, impactando el suelo con fuerza. ",
                        R.raw.shiryu2,
                        "https://static.wikia.nocookie.net/factvsfiction/images/7/75/Animation_%284%29.gif/revision/latest/scale-to-width-down/320?cb=20160520102743"),
                    Attack(
                        "Rozan hyaku ryu ha",
                        "Puño cometa de Pegaso en inglés y japonés. Técnica que consiste en concentrar los 100 meteoros en un único punto, como si se tratase de un cometa. El poder del golpe es 100 veces mayor que el de un meteoro.",
                        R.raw.shiryu3,
                        "https://i.makeagif.com/media/9-29-2015/c17dkR.gif")
                )
            )
            )
            saintList.add(Saint(
                "Hyōga de Cisne","Cisne" , "bronze" ,
                "https://snk-seiya.net/guiasaintseiya/bronze%20saint%20Hyoga%20Cisne.jpg",
                "https://e1.pxfuel.com/desktop-wallpaper/557/539/desktop-wallpaper-270-ideas-de-hyoga-en-2021-cygnus-hyoga.jpg",
                R.raw.hyogatheme,
                listOf(Attack(
                    "Diamond Dust",
                    "Puño meteoro de Pegaso en inglés y japonés. Técnica que consiste en lanzar incontables puñetazos con forma de meteoro, los cuales superan la velocidad del sonido. Su poder y velocidad aumentan a medida que el Cosmo va creciendo",
                    R.raw.hyoga1,
                    "https://pa1.aminoapps.com/6601/2c748725cfae8b324a11d2424419598250d22178_hq.gif"),
                    Attack(
                        "Kholodnyi Smerch",
                        "Choque giratorio de Pegaso en inglés. Técnica con la cual se sujeta al enemigo desde atrás, mientras ambos se elevan hacia el cielo rotando de manera violenta, impactando el suelo con fuerza. ",
                        R.raw.hyoga2,
                        "https://4.bp.blogspot.com/-F_d7yOXHI7g/U35KvKEnbvI/AAAAAAAAHjk/Qeir0sFmnJ4/s1600/Yoga+2.gif"),
                    Attack(
                        "Aurora Execution",
                        "Puño cometa de Pegaso en inglés y japonés. Técnica que consiste en concentrar los 100 meteoros en un único punto, como si se tratase de un cometa. El poder del golpe es 100 veces mayor que el de un meteoro.",
                        R.raw.hyoga3,
                        "https://imgfz.com/i/arHhj0b.gif")
                )
            )
            )
            saintList.add(Saint(
                "Shun de Andromeda","Andromeda" , "bronze" ,
                "https://i.pinimg.com/originals/95/d2/f8/95d2f8e9f261b9e5ba87214ee0ae1b85.jpg",
                "https://w0.peakpx.com/wallpaper/351/315/HD-wallpaper-shun-masami-kurumada-shingo-araki-chain-bronze-saints-saint-seiya-michi-himeno-athena-animejap-andromeda.jpg",
                R.raw.shuntheme,
                listOf(Attack(
                    "Nebula Chain",
                    "Puño meteoro de Pegaso en inglés y japonés. Técnica que consiste en lanzar incontables puñetazos con forma de meteoro, los cuales superan la velocidad del sonido. Su poder y velocidad aumentan a medida que el Cosmo va creciendo",
                    R.raw.shun1,
                    "https://i.pinimg.com/originals/fc/bf/f6/fcbff6ee451504351fcebb61058a6dd1.gif"),
                    Attack(
                        "Nebula Stream",
                        "Choque giratorio de Pegaso en inglés. Técnica con la cual se sujeta al enemigo desde atrás, mientras ambos se elevan hacia el cielo rotando de manera violenta, impactando el suelo con fuerza. ",
                        R.raw.shun2,
                        "https://64.media.tumblr.com/ce37404a47f5b7bb1e59699fc68c9c01/tumblr_mj9cxfprq51s6cql7o1_500.gif"),
                    Attack(
                        "Nebula Storm",
                        "Puño cometa de Pegaso en inglés y japonés. Técnica que consiste en concentrar los 100 meteoros en un único punto, como si se tratase de un cometa. El poder del golpe es 100 veces mayor que el de un meteoro.",
                        R.raw.shun3,
                        "https://64.media.tumblr.com/d29efa76f3f3c657c721f903437eeb00/tumblr_nzyy62f4Op1qd6g2co3_r1_250.gif")
                )
            )
            )
            saintList.add(Saint(
                "Ikki de Fénix","Phoenix" , "bronze" ,
                "https://static.wikia.nocookie.net/saintseiya/images/5/56/Fenix_Ikki_Hades_Saga.png/revision/latest/scale-to-width/360?cb=20180706004331&path-prefix=es",
                "https://w0.peakpx.com/wallpaper/238/534/HD-wallpaper-ikki-fenix.jpg",
                R.raw.ikkitheme2,
                listOf(Attack(
                    "Hôyoku Tenshô",
                    "Puño meteoro de Pegaso en inglés y japonés. Técnica que consiste en lanzar incontables puñetazos con forma de meteoro, los cuales superan la velocidad del sonido. Su poder y velocidad aumentan a medida que el Cosmo va creciendo",
                    R.raw.ikki1,
                    "https://static.wikia.nocookie.net/saintseiya/images/0/00/Tumblr_771efdd048f22b85374b46bd280bee53_07339938_640.gif/revision/latest?cb=20200130170025"),
                    Attack(
                        "Hôô Gen Ma Ken",
                        "Choque giratorio de Pegaso en inglés. Técnica con la cual se sujeta al enemigo desde atrás, mientras ambos se elevan hacia el cielo rotando de manera violenta, impactando el suelo con fuerza. ",
                        R.raw.ikki2,
                        "https://i.imgur.com/TVjyat5.gif"),
                    Attack(
                        "Hôyoku Tenshô Ken",
                        "Puño cometa de Pegaso en inglés y japonés. Técnica que consiste en concentrar los 100 meteoros en un único punto, como si se tratase de un cometa. El poder del golpe es 100 veces mayor que el de un meteoro.",
                        R.raw.ikki3,
                        "https://c.tenor.com/swCKK3zVPyEAAAAC/tenor.gif")
                )
            )
            )
        }

    }
}