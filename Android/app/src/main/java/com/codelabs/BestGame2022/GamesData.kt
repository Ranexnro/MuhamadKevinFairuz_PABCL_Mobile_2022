package com.codelabs.BestGame2022

import com.codelabs.BestGame2022.R

object GamesData {
    private  val gamesName = arrayOf(
        "Assasins Creed Odyssey",
        "Call Of Duty Cold War",
        "Battlefield V",
        "Cyberpunk",
        "Darksouls III",
        "Farcry 5",
        "Forza Horizon 4",
        "Valorant",
        "Watch Dogs",
        "E-Football PES 2021"
    )

    private  val gamesGenre = arrayOf(
        "Action, RPG (Role Playing Game)",
        "FPS (First Person Shooter)",
        "FPS (First Person Shooter)",
        "RPG (Role Playing Game)",
        "RPG (Role Playing Game)",
        "FPS (First Person Shooter)",
        "defining open-world racing game",
        "FPS (First Person Shooter)",
        "Action Adventure open-world",
        "Football, Sport"
    )

    private  val gamesRequirement = arrayOf(
        "System Requirements Assassin's Creed Odyssey (Minimum)\n" +
                "\n" +
                "OS: Windows 7/Windows 8.1/Windows 10\n" +
                "Processor: Intel Core i5 2400 3.1 GHz or AMD FX 6300 3.8 GHz\n" +
                "Memory: 8GB\n" +
                "Graphics: 2GB VRAM Nvidia GeForce GTX 660/AMD Radeon R9 285\n" +
                "DirectX: DirectX 11.0\n" +
                "Storage: 46GB",
        "System Requirements Call of Duty: Black Ops 4 (Minimum)\n" +
                "\n" +
                "OS: Windows 7 64 Bit (SP1) or Windows 10 64 Bit (v.1803 or higher)\n" +
                "Processor: Intel Core i3-4340 or AMD FX-6300\n" +
                "Memory: 8GB\n" +
                "Graphics: NVIDIA GeForce GTX 670 / GeForce GTX 1650 or Radeon HD 7950\n" +
                "DirectX: DirectX 12\n" +
                "Storage: MP Only 35GB, 82GB for all game modes",
        "System Requirements Battlefield V (Minimum)\n" +
                "\n" +
                "OS: Windows 7/Windows 8.1/Windows 10\n" +
                "Processor: Intel Core i5 6600K or AMD FX-8350\n" +
                "Memory: 8GB\n" +
                "Graphics: 2GB VRAM Nvidia GeForce GTX 660/AMD Radeon HD 7850\n" +
                "DirectX: DirectX 11.0\n" +
                "Storage: 50GB",
        "System Requirements Cyberpunk (Minimum)\n" +
                "OS: Windows 7 SP1 64-bit or Windows 8.1 64-bit or Windows 10 64-bit\n" +
                "Processor: Intel Core i5-3570K or AMD FX-8310\n" +
                "Memory: 8GB\n" +
                "Graphics: NVIDIA GeForce GTX 780 or AMD Radeon RX 470\n" +
                "DirectX: DirectX 11.0\n" +
                "Storage: 70GB",
        "System Requirements Darksoul III (Minimum)\n" +
                "OS: Windows 7/Windows 8.1/Windows 10\n" +
                "Processor: Intel Core i3-2100 or AMD FX-6300\n" +
                "Memory: 4GB\n" +
                "Graphics: 2GB VRAM Nvidia GeForce GTX 750 Ti/ATI Radeon HD 7950\n" +
                "DirectX: DirectX 11.0\n" +
                "Storage: 25GB",
        "System Requirements Far Cry 5 (Minimum)\n" +
                "\n" +
                "OS: Windows 7/Windows 8.1/Windows 10\n" +
                "Processor: Intel Core i5 2400 or AMD FX-6300 @3.5 GHz\n" +
                "Memory: 8GB\n" +
                "Graphics: 2GB VRAM Nvidia GeForce GTX 670/AMD R9 270\n" +
                "DirectX: DirectX 11.0\n" +
                "Storage: 30GB",
        "System Requirements Forza Horizon 4 (Minimum)\n" +
                "\n" +
                "OS: Windows 10\n" +
                "Processor: Intel i3-4170 @3.7 GHz or Intel i5 750 @2.67 GHz\n" +
                "Memory: 8GB\n" +
                "Graphics: 2GB VRAM Nvidia 650TI/Nvidia GT 740/AMD R7 250x\n" +
                "DirectX: DirectX 11.0\n" +
                "Storage: 55GB",
        " System Requirements Valorant (Minimum)\n" +
                "CPU: Intel Core 2 Duo E8400 / AMD Athlon 200GE\n" +
                "RAM: 4 GB\n" +
                "OS: Windows 7/8/10 64-bit\n" +
                "VIDEO CARD: Intel HD 4000 / Radeon R5 200\n" +
                "PIXEL SHADER: 3.0\n" +
                "VERTEX SHADER: 3.0",
        "System Requirements Watch Dogs (Minimum)\n" +
                "\n" +
                "OS: Windows Vista/Windows 7/Windows 8\n" +
                "Processor: Intel Core 2 Duo Q8400 2.66 GHz or AMD Phenom II X4 940 3.0 GHz\n" +
                "Memory: 6GB\n" +
                "Graphics: 1GB VRAM Nvidia GeForce GTX 460/AMD Radeon HD 5770/Intel Iris Pro HD 5200\n" +
                "DirectX: Direct X 11.0\n" +
                "Storage: 25GB",
        "System Requirements Pro Evolution Soccer 2019 (Minimum)\n" +
                "\n" +
                "OS: Windows 8.1/10 - 64bit\n" +
                "Processor: Intel Core i5-3470 / AMD FX 4350\n" +
                "Memory: 8GB\n" +
                "Graphics: NVIDIA GTX 670 / AMD Radeon HD 787\n" +
                "DirectX: DirectX Compatible\n" +
                "Storage: 40GB"
    )

    private  val gamesDetails = arrayOf(
        "Assassin's Creed Odyssey membawa kamu ke dalam petualangan dengan setting bangsa Romawi.\n" +
                "\n" +
                "Game PC terbaru ber-genre petualangan ini tepatnya mengambil latar belakang tahun 431 Sebelum Masehi (SM) dengan berceritakan Perang Peloponnesian War antara Athens dan Sparta.",
        "Menyediakan gameplay singleplayer dan multiplayer, game ini asyik untuk kamu mainkan sendiri ataupun dengan teman-temanmu. Apalagi, grafis game ini canggih banget.\n" +
                "\n" +
                "Di luar mode multiplayer-nya yang seru, campaign story di mode singleplayer-nya juga bagus banget, lho. Di sini kamu bakal dibawa ke era perang dingin tahun 1980-an antara AS dan Uni Soviet., ia juga mengeluarkan album solo yang ber-genre pop folk, Sintas.",
        "Battlefield V yang sekaligus menjadi seri ke-16 franchise game perang besutan EA ini menawarkan pengalaman grafis mumpuni dengan latar Perang Dunia II.\n" +
                "\n" +
                "Walau sempat menuai kritik karena penampilan karakter wanita dan sejumlah kekeliruan sejarah, game ini tetap saja meraih review terbilang positif di kalangan gamer.",
        "Siapa yang sudah nyoba main Cyberpunk 2077? Game PC offline terbaik 2021 ini sudah lama banget ditunggu-tunggu oleh para penggemarnya.\n" +
                "\n" +
                "Diumumkan pertama kali pada tahun 2013, butuh 7 tahun bagi game ini untuk dirilis. Wajar sih, geng. Soalnya, game ini memang adalah game next-gen.\n" +
                "\n" +
                "Butuh PC dengan spesifikasi dewa untuk bisa menjalankan game ini secara mulus. Game RPG satu ini bakalan tampil lebih cantik dengan dukungan ray tracing yang realistik abis.",
        "Sebagai salah satu game aksi berbasis RPG, Dark Souls III dikenal memiliki tingkat kesulitan tinggi sehingga tentu akan sangat menantang untuk dimainkan.\n" +
                "\n" +
                "Berkat hal ini lah, Game PC Terbaik ini meraih kesuksesan dengan meraih penjualan hingga 3 juta kopi dua bulan sejak pertama kali rilis pada Maret 2016 lalu.",
        "Jika Far Cry 4 mengambil latar belakang Pegunungan Himalaya, maka Far Cry 5 bakal mengisahkan mengenai sebuah sekte sesat yang berada di sebuah wilayah pedesaan, tepatnya di Montana, Amerika Serikat.\n" +
                "\n" +
                "Kamu bakal dihadapkan dengan Joseph Seed, yang menjadi pemimpin dari sekte sesat dan berusaha membebaskan daerah kekuasan dengan berbagai cara",
        "Kebayang nggak kalau game bergenre open world digabung dengan game balapan?\n" +
                "\n" +
                "Nah itulah yang menjadi konsep game PC terbaik ini, yang membuat kamu bisa merasakan pengalaman berbeda saat memainkan game balapan mobile yang satu ini.\n" +
                "\n" +
                "Nggak heran juga dengan begini Forza Horizon 4 juga mendapatkan review baik dari berbagai kalangan.",
        "Game first person shooter atau FPS kini sedang digemari oleh banyak player gaming. Permainan saling adu tembak antar player ini memiliki sensasi cukup mengasyikkan. Ada beberapa game dengan kategori FPS yang menjadi favorit, salah satunya adalah Valorant.\n" +
                "\n" +
                "Valorant merupakan game FPS bentukan Riot Games. Permainan ini dibuat untuk sistem operasi Windows. Di dalam game terdapat dua tim, yaitu attacker dan defender, yang masing-masing terdiri dari lima pemain. Pemain akan diberikan 13 ronde untuk menyerang dan mempertahankan wilayahnya. Kemudian para player hanya diberikan 1 nyawa dalam 1 ronde. Untuk itu ketangkasan dan strategi tim sangat diperlukan.",
        "Buat kamu yang terobsesi menjadi seorang hacker, Watch Dogs sangat direkomendasikan untuk diikuti alur ceritanya.\n" +
                "\n" +
                "Game ini bercerita mengenai seseorang bernama Aiden Pearce yang merupakan seorang hacker yang menyimpan dendam setelah kematian keponakannya.\n" +
                "\n" +
                "Dalam game Watch Dogs, kamu bahkan bisa mengendalikan Chicago hanya dalam genggaman smartphone.",
        "eFootball Pro Evolution Soccer 2021 (PES 2021) tentu nggak akan asing buat para penggemar sepak bola di Indonesia.\n" +
                "\n" +
                "Game PC terbaru yang dipublikasikan oleh Konami ini juga membawa sejumlah penambahan lisensi liga dan klub dalam game sepak bola terbarunya ini lho.\n" +
                "\n" +
                "Sayangnya, game ini sebenarnya hanyalah season update untuk game PES 2020 di tahun sebelumnya. Grafik dan engine masih sama, hanya saja diberi update tim, pemain, dan seragam saja."
    )

    private  val gamesImages = intArrayOf(
        R.drawable.assains_creed_odyssey,
        R.drawable.call_of_dutty_cold,
        R.drawable.battle_field,
        R.drawable.cyber_punk,
        R.drawable.dark_souls,
        R.drawable.farcry,
        R.drawable.forza_horizon4,
        R.drawable.valorant,
        R.drawable.watch_dogs,
        R.drawable.football
    )

    val listData : ArrayList<Games>
    get(){
        val list = arrayListOf<Games>()
        for(position in gamesName.indices){
            val games = Games()
            games.name = gamesName[position]
            games.genre = gamesGenre[position]
            games.requirement = gamesRequirement[position]
            games.detail = gamesDetails[position]
            games.photo = gamesImages[position]
            list.add(games)
        }
        return list
    }

}