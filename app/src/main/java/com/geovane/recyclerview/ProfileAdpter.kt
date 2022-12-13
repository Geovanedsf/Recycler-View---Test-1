package com.geovane.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.geovane.recyclerview.models.Profile
import kotlinx.android.synthetic.main.res_item_profile.view.*

// É uma subclasse do RecycleView, que herda absolutamente tudo do Recycle e serve para adptar todos os dados para que caibam
// em um componente visual, que caibam em uma lista
// ADAPTER opcao "RH" e recebe o <RecycleView e ViewHolder>()
// {ProfileAdpter} apertar OPTIONS + Enter (implement members) selecionar todas opcoes

class ProfileAdpter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Profile>

// TODES OVERRIDE SE EXECUTA SOZINHO

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.res_item_profile, parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is ProfileViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(list: List<Profile>) {
        this.items = list  // ELE APONTA "ESTE" SEMPRE O QUE ESTA DENTRO DA CLASSE E NAO DA FUNCAO
    }

// Cirar class dentro de outra class - Construtor usado como parametro de função

    class ProfileViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView){
        private val profileName = itemView.name
        private val profileLinguage = itemView.language
        private val profileImage = itemView.image

        fun bind(profile: Profile) {  // meu ViewHolder vai ouvir o que o profile disser
            profileName.text = profile.nome
            profileLinguage.text = profile.linguagem
            profileImage.setImageResource(profile.imagem)

        }
    }
}