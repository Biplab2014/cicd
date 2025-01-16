package com.test.varahatest

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.varahatest.model.Task
import com.test.varahatest.ui.theme.VarahatestTheme
import com.test.varahatest.view.TaskAdapter
import com.test.varahatest.viewModel.TaskViewModel

class MainActivity : ComponentActivity() {
    var rv:RecyclerView ? = null
    val viewModel:TaskViewModel by viewModels()
    var taskList:MutableList<Task> = mutableListOf()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        rv = findViewById(R.id.taskListRV)
        rv?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv?.setHasFixedSize(true)
        rv?.setItemViewCacheSize(10)
        //rv?.adapter = TaskAdapter(taskList)

        viewModel.loadTaskList()
        viewModel.taskListML.observe(this){
            //var taskList = it
            taskList.clear()
            taskList.addAll(it)
            rv?.adapter = TaskAdapter(taskList)
        }
    }
}