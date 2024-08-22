package me.osumatrix.taskmanager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform