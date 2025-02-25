package dev.rafaz.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.rafaz.portfolio.ui.theme.PortfolioTheme
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import dev.rafaz.portfolio.ui.theme.PortfolioTheme.typography

@Composable
fun ExperienceScree() {

}

@Composable
fun CompanyItem(item: WorkedCompany) {
    Row {
        Column {
            Image(painter = painterResource(id = item.icon), contentDescription = null)
        }
        Column {
            Text(text = item.name, style = typography.headlineMedium)

            item.positions.forEachIndexed { index, positionInCompany ->
                Column {
                    Text(text = positionInCompany.getPeriodLabel(), style = typography.titleMedium)
                    Text(text = positionInCompany.location, style = typography.titleMedium)
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = positionInCompany.position, style = typography.titleMedium)
                    Text(text = positionInCompany.description, style = typography.bodySmall)
                }
            }
        }
    }
}

data class WorkedCompany(
    val name: String,
    val icon: Int,
    val positions: List<PositionInCompany>
) {

}

data class PositionInCompany(
    val start: Date,
    val end: Date?,
    val location: String,
    val position: String,
    val skills: List<String>,
    val description: String
) {
    fun getPeriodLabel(): String {
        val datePattern = "MMM yyyy"
        val formatter = SimpleDateFormat(datePattern)
        val startStr = formatter.format(start)
        val endStr = if (end == null) "Present" else formatter.format(end)
        return "$startStr - $endStr"
    }
}

@Preview(name = "MC1 Experience", showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun CompanyItemPreview() {
    val item = WorkedCompany(
        name = "MC1 - Win The Market",
        icon = R.drawable.mc1_logo,
        positions = listOf(
            PositionInCompany(
                start = toDate(2016, 11),
                end = toDate(2017, 11),
                location = "São Paulo - Brazil",
                position = "Software Engineer Intern",
                skills = listOf("Retrofit", "MVVM"),
                description = "Software house focused on Sales Execution, Sales Force Automation, Mobile, Trade Marketing, Sales Force Effectiveness, Merchandising, Retail Execution, Sales Force e Field Marketing.\n" +
                        "* Helped to develop a proprietary Server-Driven UI SDK\n" +
                        "* Build Custom UI Components from zero\n" +
                        "* Helped with the implementation internationally at our first customer (Mexico)"
            )
        )
    )
    PortfolioTheme {
        CompanyItem(item = item)
    }
}

fun toDate(year: Int, month: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.set(Calendar.YEAR, year)
    calendar.set(Calendar.MONTH, month)
    return calendar.time
}