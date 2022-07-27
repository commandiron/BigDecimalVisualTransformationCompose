package com.commandiron.bigdecimalvisualtransformationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.commandiron.big_decimal_visual_transformation_compose.BigDecimalVisualTransformationWithUnit
import com.commandiron.bigdecimalvisualtransformationcompose.ui.theme.BigDecimalVisualTransformationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BigDecimalVisualTransformationComposeTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    val bigDecimal = 123456879.12.toBigDecimal()

                    TextField(
                        value = bigDecimal.toString(),
                        onValueChange = {},
                        visualTransformation = BigDecimalVisualTransformationWithUnit(
                            unit = "unit",
                        )
                    )

                    val correctedBigDecimal =
                        BigDecimalVisualTransformationWithUnit().getTransformedText(
                            text = bigDecimal.toString(),
                            addedUnit = "unit"
                        )

                    Text(
                        text = correctedBigDecimal,
                        style = MaterialTheme.typography.h4
                    )
                }
            }
        }
    }
}
