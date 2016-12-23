package spring

import cors.CorsFilter
import intellidots.ComparationService

// Place your Spring DSL code here
beans = {
    corsFilter(CorsFilter)
    comparationService(ComparationService)
}