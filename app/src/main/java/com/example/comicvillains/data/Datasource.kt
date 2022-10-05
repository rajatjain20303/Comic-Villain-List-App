package com.example.comicvillains.data
import com.example.comicvillains.R
import com.example.comicvillains.module.villains
class Datasource() {
    fun loadVillains(): List<villains> {
        return listOf<villains>(
            villains(R.string.villain1_name,R.string.thanos,R.drawable.villains1),
            villains(R.string.villain2_name,R.string.Gorr, R.drawable.villains2),
            villains(R.string.villain3_name,R.string.Wenvu, R.drawable.wenvu),
            villains(R.string.villain4,R.string.Bane, R.drawable.bane),
            villains(R.string.villain5,R.string.darkseid, R.drawable.darkseid),
            villains(R.string.villain6,R.string.hela, R.drawable.hela),
            villains(R.string.villain7,R.string.joker, R.drawable.joker),
            villains(R.string.villain8,R.string.killmonger, R.drawable.killmonger),
            villains(R.string.villain9,R.string.loki, R.drawable.loki),
            villains(R.string.villain10,R.string.redskull,R.drawable.red_skull),
            villains(R.string.villain11,R.string.riddler,R.drawable.riddler),
            villains(R.string.villain12,R.string.ultron,R.drawable.ultron)
        )
    }
}