{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyMF42s0wSl8mXA5fuX2QPcy",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/JohnN9323/JAVA/blob/main/Java_test.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "pbX2tv8K6aF9"
      },
      "outputs": [],
      "source": [
        "import java.util.Scanner;\n",
        "\n",
        "public class Learning {\n",
        "\n",
        "   public static void main(String[] args) {\n",
        "   patterns printing using for loop\n",
        "\n",
        "   Scanner scn = new Scanner(System.in);\n",
        "   int n = scn.nextInt();\n",
        "\n",
        "   for (int i = 1; i <= n; i++) {\n",
        "   var patternToPrint = \"\";\n",
        "   for (int j = i; j <= n; j++) {\n",
        "   patternToPrint += \" \";\n",
        "   }\n",
        "   for (int k = 1; k <= i; k++) {\n",
        "   patternToPrint += \"*\";\n",
        "   }\n",
        "   System.out.println(patternToPrint);\n",
        "   }\n",
        "   System.out.println();\n",
        "   scn.close();\n",
        "   }\n",
        "}"
      ]
    },
    {
      "cell_type": "code",
      "source": [],
      "metadata": {
        "id": "DBdB01uU7WYF"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "markdown",
      "source": [],
      "metadata": {
        "id": "cCENQ5j97XTz"
      }
    }
  ]
}