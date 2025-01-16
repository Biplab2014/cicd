package com.test.varahatest.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.varahatest.model.Task

class TaskViewModel:ViewModel() {
    var taskListML = MutableLiveData<List<Task>>()
    //var _taskList:LiveData<List<Task>> get() =

    fun loadTaskList(){
        val taskList = listOf  (
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for MondaySlides for MondaySlides for MondaySlides for MondaySlides for MondaySlides for MondaySlides for MondaySlides for MondaySlides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, BreadMilk, Eggs, BreadMilk, Eggs, BreadMilk, Eggs, BreadMilk, Eggs, BreadMilk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for MondaySlides for MondaySlides for MondaySlides for MondaySlides for MondaySlides for MondaySlides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for Monday", status = "Pending"),
            Task(id = 1, title = "Buy Groceries", description = "Milk, Eggs, Bread", status = "To Do"),
            Task(id = 2, title = "Prepare Presentation", description = "Slides for Monday", status = "Pending"),
            Task(id = 3, title = "Morning Workout", description = "Run 5km", status = "Completed")
        )
        taskListML.value = taskList
    }
}