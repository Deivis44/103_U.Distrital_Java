package CAP_7.Ejercicios.David_Munoz._721;

import java.util.Scanner;

public class Logo { // Abre clase Logo
    Scanner entrada = new Scanner(System.in);
    private int Direccion = 'l';
    private int Pluma = 1; // La pluma inicia hacia arriba
    private int ANCHO_TABLERO = 90;
    private int ALTO_TABLERO = 40;
    private int Tablero[][] = new int[ALTO_TABLERO + 1][ANCHO_TABLERO + 1];
    private int X = 1; // La tortuga inicia en la parte superior
    private int Y = 1; // izquierda

    public void Administrador_Logo() { // Abre metodo Administrdor_Logo

        int comando;

        System.out.println("\nPor favor introduzca comando: ");
        comando = entrada.nextInt();

        while (0 != comando) { // Abre while
            switch (comando) { // Abre switch
                case 1:
                    System.out.println("\nLa pluma esta hacia arriba.");
                    Pluma = 1;
                    break;
                case 2:
                    System.out.println("\nLa pluma esta hacia abajo.");
                    Pluma = 2;
                    break;

                case 3:
                    System.out.println("\nSe gira a la derecha.");
                    switch (Direccion) { // Abre switch anidado
                        case 'k':
                            Direccion = 'l';
                            break;
                        case 'l':
                            Direccion = 'j';
                            break;
                        case 'j':
                            Direccion = 'h';
                            break;
                        case 'h':
                            Direccion = 'k';
                            break;
                        default:
                            System.out.println("\nDireccion Invalida");
                            break;
                    } // Cierra switch anidado
                    break;

                case 4:
                    System.out.println("\nSe gira a la izquierda");
                    switch (Direccion) { // Abre switch
                        case 'k':
                            Direccion = 'h';
                            break;
                        case 'h':
                            Direccion = 'j';
                            break;
                        case 'j':
                            Direccion = 'l';
                            break;
                        case 'l':
                            Direccion = 'k';
                            break;
                        default:
                            System.out.println("\nDireccion invalida.");
                            break;
                    } // Cierra switch
                    break;

                case 5:
                    Avanza();
                    break;
                case 6:
                    Imprimir_Tablero();
                    break;
                case 7:
                    System.out.printf("\nLa direccion de la tortuga es: %c", Direccion);
                    System.out.printf("\nLa posicion de la tortuga es X = %d, Y = %d\n", X, Y);
                    break;
                case 8:
                    System.out.println("\nLos comandos son:");
                    Imprimir_Comandos();
                    break;

                default:
                    System.out.println("\nComando invalido.\n");
                    break;

            } // Cierra switch
            System.out.print("\nPor favor introduzca comando, 0 para terminar, ");
            System.out.print("8 para imprimir los comandos.\n");
            comando = entrada.nextInt();

        } // Cierra while
    } // Cierra metodo Administrador_Logo

    ////////////////////////////////////////////////
    // METODO AVANZA
    ///////////////////////////////////////////////

    public void Avanza() { // Abre metodo Avanza
        int casillas_avanza;
        System.out.println("\nPor favor introduzca las posiciones que avanzara la tortuga: ");
        casillas_avanza = entrada.nextInt();
        switch (Direccion) { // Abre switch
            case 'l':

                if (X + casillas_avanza <= ANCHO_TABLERO)

                { // Abre if
                    if (1 != Pluma) // Si la pluma esta hacia abajo
                        for (int i = X; i <= X + casillas_avanza; i++)
                            Tablero[Y][i] = 1;

                    // El cambio en X se hace al final
                    // para no afectar a la variable que de hecho aparece
                    // en el ciclo for anterior
                    X += casillas_avanza;

                } // Cierra if
                else { // Abre else
                    if (1 != Pluma)
                        for (int j = X; j <= ANCHO_TABLERO; j++)
                            Tablero[Y][j] = 1;
                    X = ANCHO_TABLERO;
                    // De nuevo, el cambio en X se hace al final, de lo contrario
                    // Se alteraria la misma variable que aparece en el diclo for
                } // Cierra else
                break;

            case 'h':
                if (1 <= X - casillas_avanza) { // Abre if
                    if (1 != Pluma)
                        for (int i = X; i >= X - casillas_avanza; i--) { // Abre for
                            Tablero[Y][i] = 1;
                        } // Cierra for

                    X -= casillas_avanza;
                } // Cierra if
                else // es decir, si X - casillas_avanza < 1
                { // Abre else
                    if (1 != Pluma)
                        for (int i = X; i >= 1; i--)
                            Tablero[Y][i] = 1;

                    X = 1;
                } // Cierra else
                break;

            case 'j':
                if (Y + casillas_avanza <= ALTO_TABLERO)

                { // Abre if
                    if (1 != Pluma) // Si la pluma esta hacia abajo
                        for (int i = Y; i <= Y + casillas_avanza; i++)
                            Tablero[i][X] = 1;

                    // El cambio en Y se hace al final
                    // para no afectar a la variable que de hecho aparece
                    // en el ciclo for anterior
                    Y += casillas_avanza;

                } // Cierra if
                else { // Abre else
                    if (1 != Pluma)
                        for (int j = Y; j <= ALTO_TABLERO; j++)
                            Tablero[j][X] = 1;
                    Y = ALTO_TABLERO;
                    // De nuevo, el cambio en X se hace al final, de lo contrario
                    // Se alteraria la misma variable que aparece en el diclo for
                } // Cierra else
                break;

            case 'k':

                if (1 <= Y - casillas_avanza) { // Abre if
                    if (1 != Pluma)
                        for (int i = Y; i >= Y - casillas_avanza; i--) { // Abre for
                            Tablero[i][X] = 1;
                        } // Cierra for

                    Y -= casillas_avanza;
                } // Cierra if
                else // es decir, si X - casillas_avanza < 1
                { // Abre else
                    if (1 != Pluma)
                        for (int i = Y; i >= 1; i--)
                            Tablero[i][X] = 1;

                    Y = 1;
                } // Cierra else
                break;

            default:
                System.out.println("\nDireccion equivocada.");
                break;
        } // Cierra switch
    } // Cierra metodo Avanza

    ///////////////////////////////////////////////
    // IMPRIMIR_TABLERO
    ///////////////////////////////////////////////

    public void Imprimir_Tablero() { // Abre metodo Imprimir_Tablero

        System.out.printf("\nEl Tablero es de %d de ancho X %d de alto\n", ANCHO_TABLERO, ALTO_TABLERO);
        // Imprime contorno superior del tablero
        System.out.printf("|");
        for (int n = 1; n <= ANCHO_TABLERO; n++)
            System.out.printf("-");

        System.out.printf("|\n");
        // Imprime el tablero
        for (int i = 1; i <= ALTO_TABLERO; i++) { // Abre for
            // Escribe contorno derecho
            System.out.printf("|");
            // Imprime renglon
            for (int j = 1; j <= ANCHO_TABLERO; j++) { // Abre for anidado
                if (0 == Tablero[i][j])
                    System.out.printf(" ");
                else
                    System.out.printf("*");
            } // Cierra for anidado
            System.out.printf("|%d\n", i);
        } // Cierra for

        // Imprime contorno inferior del tablero
        System.out.printf("|");
        for (int m = 1; m <= ANCHO_TABLERO; m++)
            System.out.printf("-");
        System.out.printf("|");

    } // Cierra metodo Imprimir_Tablero

    ///////////////////////////////////////////////
    // METODO IMPRIMIR_COMANDOS
    ///////////////////////////////////////////////

    public void Imprimir_Comandos() { // Abre metodo Imprimir_Comandos
        System.out.println("\n1 Pluma hacia arriba.");
        System.out.println("2 Pluma hacia abajo.");
        System.out.println("3 Gira a la derecha.");
        System.out.println("4 Gira a la izquierda.");
        System.out.println("5 Avanza.");
        System.out.println("6 Imprime Tablero.");
        System.out.println("7 Imprime Posicion y Direccion.");
        System.out.println("8 Imprime comandos.");
    } // Cierra metodo Imprimir_Comandos

} // Cierra clase Logo