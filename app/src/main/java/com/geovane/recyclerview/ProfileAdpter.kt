package com.geovane.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.geovane.recyclerview.models.Profile
import kotlinx.android.synthetic.main.res_item_profile.view.*
         // Funcao do adpter é adptar o componente visual para seu código
         // É uma subclasse do RecycleView, que herda absolutamente tudo do Recycle e serve para adptar todos os dados para que caibam
         // em um componente visual, que caibam em uma lista
         // ADAPTER opcao "RH" e recebe o <RecycleView e ViewHolder>()
         // {ProfileAdpter} apertar OPTIONS + Enter (implement members) selecionar todas opcoes

class ProfileAdpter(private val onClicked: (Profile) -> Unit ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        // Classe UNIT permite que eu insira acao/click encima do adpter
    private lateinit var items: List<Profile>

         // TODES OVERRIDE SE EXECUTA SOZINHO

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_profile, parent,false)
                // LAYOUT VAI SER INFLADO NO MOMENTO QUE ELE COMECAR A SER UTILIZADO
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is ProfileViewHolder -> {
                holder.bind(items[position], onClicked)  // ESTA DIZENDO, AGORA VOCE ESTA INDO PARA A TELA
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(list: List<Profile>) {
        this.items = list  // "THIS" APONTA SEMPRE O QUE ESTA DENTRO DA CLASSE E NAO DA FUNCAO
    }
          // Criar class dentro de outra class - Construtor usado como parametro de função
  // --------- PREPAROU o VIEWHOLDER PARA QUE ELE CONSIGA SE CONECTAR COM O LAYOUT - VIEWHOLDER serve para que eu controle meu xml = layout

    class ProfileViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView){
        private val profileName = itemView.name
        private val profileLinguage = itemView.language
        private val profileImage = itemView.image

            // BIND funcao que ouve tudo que a "model = profilename,linguage... esta falando" - > Entende o que esta dentro da VIEWHOLDER

        fun bind(profile: Profile, onClicked: (Profile) -> Unit) {  // meu ViewHolder vai ouvir o que o profile disser
            profileName.text = profile.nome
            profileLinguage.text = profile.linguagem
            profileImage.setImageResource(profile.imagem)

            itemView.setOnClickListener {
                onClicked(profile)
            }

        }
    }
}