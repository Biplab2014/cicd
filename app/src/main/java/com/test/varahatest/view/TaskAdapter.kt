package com.test.varahatest.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.test.varahatest.R
import com.test.varahatest.model.Task


class TaskAdapter(val taskList:List<Task>): RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    init {
        setHasStableIds(true) // Enable stable IDs for this adapter
    }

    inner class TaskViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        val taskId = itemview.findViewById<TextView>(R.id.taskId)
        val taskTitle = itemview.findViewById<TextView>(R.id.taskTitle)
        val taskDesc = itemview.findViewById<TextView>(R.id.taskDesc)
        val taskStatus = itemview.findViewById<TextView>(R.id.taskStatus)
        val statuupdate = itemview.findViewById<Button>(R.id.statuupdate)

        init {
            statuupdate.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val task = taskList[position]
                    when(task.status){
                        "Pending" -> {
                            task.status = "To Do"
                        }
                        "Complete"->{
                            task.status = "Pending"
                        }
                        "To Do"->{
                            task.status = "Complete"
                        }
                    }
                    taskStatus.text = task.status
                }
            }
        }


        fun bind(task:Task){
            taskId.text = task.id.toString()
            taskTitle.text = task.title
            taskDesc.text = task.description
            taskStatus.text = task.status
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view: View =   LayoutInflater.from(parent.context).inflate(R.layout.tasklistnew, parent, false)
        return TaskViewHolder(view)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(taskList[position])
    }
}