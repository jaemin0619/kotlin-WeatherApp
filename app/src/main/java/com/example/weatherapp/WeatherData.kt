package com.example.weatherapp

data class WeatherData(
    val time: String = "--:--",
    val skyStatus: SkyStatus = SkyStatus.GOOD,
    val rainPercent: String = "-",
    val rainState: RainStatus = RainStatus.NONE,
    val rainAmount: String = "-",
    val temperature: String = "-",
    val windSpeed: String = "-",
    val humidity: String = "-"
) {

    override fun toString(): String {
        return "날씨 : 하늘 상태 : ${skyStatus.name} " +
                "\n 강수 확률: $rainPercent \n 강수 형태: ${rainState.name}" +
                "\n 강수량 : $rainAmount \n 기온 : $temperature 도 " +
                "\n 풍속 : $windSpeed \n 습도 : $humidity"
    }
}

enum class RainStatus(val value: Int, val icon: Int) {
    NONE(0, R.drawable.ic_sunny),
    RAIN(1, R.drawable.ic_water),
    RAIN_SNOW(2, R.drawable.ic_rain_snow),
    SNOW(3, R.drawable.ic_snow),
    FALL(4, R.drawable.ic_rainy)
}

enum class SkyStatus(val value: Int, val text: String, val icon: Int, val colorIcon: Int) {
    GOOD(1, "맑음", R.drawable.ic_sunny, R.drawable.ic_color_sunny),
    CLOUDY(3, "구름 많음", R.drawable.ic_sun_cloudy, R.drawable.ic_color_sunny_cloudy),
    BAD(4, "흐림", R.drawable.ic_cloudy_2, R.drawable.ic_color_cloudy)
}