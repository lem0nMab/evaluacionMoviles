package ni.edu.uca.evaluacionmoviles

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.evaluacionmoviles.databinding.ItemBinding

class DataAdapter (private val coordinadores: List<Data>) :
    RecyclerView.Adapter<DataAdapter.CoordinadorViewHolder>(){

    inner class CoordinadorViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Data) {
            binding.tvNombres.text = data.nombres
            binding.tvApellidos.text = data.apellidos
            binding.tvFechaNac.text = data.fechaNac
            binding.tvTitulo.text = data.titulo
            binding.tvEmail.text = data.email
            binding.tvFacultad.text = data.facultad
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoordinadorViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoordinadorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoordinadorViewHolder, position: Int) {
        holder.bind(coordinadores[position])
    }

    override fun getItemCount(): Int {
        return coordinadores.size
    }
}
