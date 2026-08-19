import java.util.Scanner;
public class artesania_virtual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresArtesanias = new String[10];
        String[] artesanos = new String[10];
        String[] categorias = new String[10];
        String[] materiales = new String[10];
        String[] tecnicas = new String[10];
        String[] regiones = new String[10];
        String[] precios = new String[10];
        String[] fechas = new String[10];
        String[] tamanos = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------//
        //--|menu_principal_de_artesania_virtual|--//
        //-----------------------------------------//
        do {
            System.out.println("menu principal de artesania virtual");
            System.out.println("1) Registrar artesania");
            System.out.println("2) Editar artesania");
            System.out.println("3) Listar artesanias");
            System.out.println("4) Buscar artesania");
            System.out.println("5) Eliminar artesania");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-------------------------//
                //--|registrar_artesania|--//
                //-------------------------//
                case 1:
                    if (total >= nombresArtesanias.length) {
                        System.out.println("No hay espacio para registrar mas artesanias.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de artesania");
                    System.out.println("id de la artesania a registrar: " + id);
                    System.out.print("nombre de la artesania: ");
                    nombresArtesanias[total] = entrada.nextLine();
                    System.out.print("nombre del artesano: ");
                    artesanos[total] = entrada.nextLine();
                    System.out.print("categoria: ");
                    categorias[total] = entrada.nextLine();
                    System.out.print("material principal: ");
                    materiales[total] = entrada.nextLine();
                    System.out.print("tecnica utilizada: ");
                    tecnicas[total] = entrada.nextLine();
                    System.out.print("region de origen: ");
                    regiones[total] = entrada.nextLine();
                    System.out.print("precio: ");
                    precios[total] = entrada.nextLine();
                    System.out.print("fecha de elaboracion: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("tamaño: ");
                    tamanos[total] = entrada.nextLine();
                    System.out.print("estado de la artesania: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Artesania registrada correctamente.");
                    total++;
                    break;
                //----------------------//
                //--|editar_artesania|--//
                //----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen artesanias registradas.");
                        break;
                    }
                    System.out.println("Datos de las artesanias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Artesania: " + nombresArtesanias[i] + " | Artesano: " + artesanos[i] + " | Categoria: " + categorias[i] + " | Material: " + materiales[i] + " | Tecnica: " + tecnicas[i] + " | Region: " + regiones[i] + " | Precio: " + precios[i] + " | Fecha: " + fechas[i] + " | Tamaño: " + tamanos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la artesania: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato de la artesania");
                        System.out.print("Nuevo nombre de la artesania: ");
                        nombresArtesanias[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del artesano: ");
                        artesanos[posicion] = entrada.nextLine();
                        System.out.print("Nueva categoria: ");
                        categorias[posicion] = entrada.nextLine();
                        System.out.print("Nuevo material principal: ");
                        materiales[posicion] = entrada.nextLine();
                        System.out.print("Nueva tecnica utilizada: ");
                        tecnicas[posicion] = entrada.nextLine();
                        System.out.print("Nueva region de origen: ");
                        regiones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo precio: ");
                        precios[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de elaboracion: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tamaño: ");
                        tamanos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de la artesania: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Artesania actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|listar_artesanias|--//
                //-----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen artesanias registradas.");
                    } else {
                        System.out.println("Lista de artesanias");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Artesania: " + nombresArtesanias[i] + " | Artesano: " + artesanos[i] + " | Categoria: " + categorias[i] + " | Material: " + materiales[i] + " | Tecnica: " + tecnicas[i] + " | Region: " + regiones[i] + " | Precio: " + precios[i] + " | Fecha: " + fechas[i] + " | Tamaño: " + tamanos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //----------------------//
                //--|buscar_artesania|--//
                //----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen artesanias registradas.");
                        break;
                    }
                    System.out.println("busqueda de artesania");
                    System.out.print("ingresa la id para buscar artesania: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la artesania encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Artesania: " + nombresArtesanias[posicion] + " | Artesano: " + artesanos[posicion] + " | Categoria: " + categorias[posicion] + " | Material: " + materiales[posicion] + " | Tecnica: " + tecnicas[posicion] + " | Region: " + regiones[posicion] + " | Precio: " + precios[posicion] + " | Fecha: " + fechas[posicion] + " | Tamaño: " + tamanos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|eliminar_artesania|--//
                //------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen artesanias registradas.");
                        break;
                    }
                    System.out.println("Datos de las artesanias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Artesania: " + nombresArtesanias[i] + " | Artesano: " + artesanos[i] + " | Categoria: " + categorias[i] + " | Material: " + materiales[i] + " | Tecnica: " + tecnicas[i] + " | Region: " + regiones[i] + " | Precio: " + precios[i] + " | Fecha: " + fechas[i] + " | Tamaño: " + tamanos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la artesania a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombresArtesanias[i] = nombresArtesanias[i + 1];
                            artesanos[i] = artesanos[i + 1];
                            categorias[i] = categorias[i + 1];
                            materiales[i] = materiales[i + 1];
                            tecnicas[i] = tecnicas[i + 1];
                            regiones[i] = regiones[i + 1];
                            precios[i] = precios[i + 1];
                            fechas[i] = fechas[i + 1];
                            tamanos[i] = tamanos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Artesania eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen artesanias registradas.");
                        break;
                    }
                    int disponibles = 0;
                    int reservadas = 0;
                    int vendidas = 0;
                    int enElaboracion = 0;
                    int agotadas = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Disponible")) {
                            disponibles++;
                        } else if (estados[i].equalsIgnoreCase("Reservada")) {
                            reservadas++;
                        } else if (estados[i].equalsIgnoreCase("Vendida")) {
                            vendidas++;
                        } else if (estados[i].equalsIgnoreCase("En elaboracion")) {
                            enElaboracion++;
                        } else if (estados[i].equalsIgnoreCase("Agotada")) {
                            agotadas++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String categoriaMayor = categorias[0];
                    int cantidadCategoriaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadCategoria = 0;
                        for (int j = 0; j < total; j++) {
                            if (categorias[i].equalsIgnoreCase(categorias[j])) {
                                cantidadCategoria++;
                            }
                        }
                        if (cantidadCategoria > cantidadCategoriaMayor) {
                            cantidadCategoriaMayor = cantidadCategoria;
                            categoriaMayor = categorias[i];
                        }
                    }
                    String artesanoMayor = artesanos[0];
                    int cantidadArtesanoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadArtesano = 0;
                        for (int j = 0; j < total; j++) {
                            if (artesanos[i].equalsIgnoreCase(artesanos[j])) {
                                cantidadArtesano++;
                            }
                        }
                        if (cantidadArtesano > cantidadArtesanoMayor) {
                            cantidadArtesanoMayor = cantidadArtesano;
                            artesanoMayor = artesanos[i];
                        }
                    }
                    String materialMayor = materiales[0];
                    int cantidadMaterialMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadMaterial = 0;
                        for (int j = 0; j < total; j++) {
                            if (materiales[i].equalsIgnoreCase(materiales[j])) {
                                cantidadMaterial++;
                            }
                        }
                        if (cantidadMaterial > cantidadMaterialMayor) {
                            cantidadMaterialMayor = cantidadMaterial;
                            materialMayor = materiales[i];
                        }
                    }
                    String tecnicaMayor = tecnicas[0];
                    int cantidadTecnicaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTecnica = 0;
                        for (int j = 0; j < total; j++) {
                            if (tecnicas[i].equalsIgnoreCase(tecnicas[j])) {
                                cantidadTecnica++;
                            }
                        }
                        if (cantidadTecnica > cantidadTecnicaMayor) {
                            cantidadTecnicaMayor = cantidadTecnica;
                            tecnicaMayor = tecnicas[i];
                        }
                    }
                    String regionMayor = regiones[0];
                    int cantidadRegionMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadRegion = 0;
                        for (int j = 0; j < total; j++) {
                            if (regiones[i].equalsIgnoreCase(regiones[j])) {
                                cantidadRegion++;
                            }
                        }
                        if (cantidadRegion > cantidadRegionMayor) {
                            cantidadRegionMayor = cantidadRegion;
                            regionMayor = regiones[i];
                        }
                    }
                    String tamanoMayor = tamanos[0];
                    int cantidadTamanoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTamano = 0;
                        for (int j = 0; j < total; j++) {
                            if (tamanos[i].equalsIgnoreCase(tamanos[j])) {
                                cantidadTamano++;
                            }
                        }
                        if (cantidadTamano > cantidadTamanoMayor) {
                            cantidadTamanoMayor = cantidadTamano;
                            tamanoMayor = tamanos[i];
                        }
                    }
                    String estadoMayor = estados[0];
                    int cantidadEstadoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEstado = 0;
                        for (int j = 0; j < total; j++) {
                            if (estados[i].equalsIgnoreCase(estados[j])) {
                                cantidadEstado++;
                            }
                        }
                        if (cantidadEstado > cantidadEstadoMayor) {
                            cantidadEstadoMayor = cantidadEstado;
                            estadoMayor = estados[i];
                        }
                    }
                    System.out.println("resumen de artesania virtual");
                    System.out.println("Artesanias registradas: " + total);
                    System.out.println("Categoria mas frecuente: " + categoriaMayor);
                    System.out.println("Artesano con mas piezas: " + artesanoMayor);
                    System.out.println("Material mas utilizado: " + materialMayor);
                    System.out.println("Tecnica mas utilizada: " + tecnicaMayor);
                    System.out.println("Region con mas artesanias: " + regionMayor);
                    System.out.println("Tamaño mas frecuente: " + tamanoMayor);
                    System.out.println("Estado mas frecuente: " + estadoMayor);
                    System.out.println("Disponibles: " + disponibles);
                    System.out.println("Reservadas: " + reservadas);
                    System.out.println("Vendidas: " + vendidas);
                    System.out.println("En elaboracion: " + enElaboracion);
                    System.out.println("Agotadas: " + agotadas);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Artesania Virtual.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}