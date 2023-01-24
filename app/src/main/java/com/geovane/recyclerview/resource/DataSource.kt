package com.geovane.recyclerview.resource

import com.geovane.recyclerview.R
import com.geovane.recyclerview.model.Profile

// Onde vamos mocar todos os dados da nossa lista - escrever diretamente no código
// termo mocar = escrever dados dentro do meu código e utilizo ele ali mesmo, não preciso trazer de nenhum lugar externo.

class DataSource {
     companion object { // funcao estatica de uma classe ou variavel (DE MANEIRA GENERICA)
        fun createDataSet() : ArrayList<Profile> {
            val list = ArrayList<Profile>()

            list.add(
                Profile(
                    "Geovane",
                    "Portugues",
                    R.drawable.img,
                    "https://www.youtube.com/watch?v=pSxooe9BHgI"
                )
            )
            list.add(
                Profile(
                    "Gabriela",
                    "Portugues",
                    R.drawable.img_4,
                    "https://www.youtube.com/watch?v=pSxooe9BHgI"
                )
            )
            list.add(
                Profile(
                    "Gabriele",
                    "Portugues",
                    R.drawable.img_3,
                    "https://www.youtube.com/watch?v=pSxooe9BHgI"
                )
            )
            list.add(
                Profile(
                    "Ricardo",
                    "Portugues",
                    R.drawable.img_1,
                    "https://www.youtube.com/watch?v=pSxooe9BHgI"
                )
            )
            list.add(
                Profile(
                    "Diego",
                    "Portugues",
                    R.drawable.img_2,
                    "https://www.youtube.com/watch?v=pSxooe9BHgI"
                )
            )
            return list
        }
     }
}



