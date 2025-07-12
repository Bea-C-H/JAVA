package com.cursojava;

public class CicloGC {

    static class ObjetoPesado {
        private int[] arreglo = new int[1_000_000];

        @Override
        protected void finalize() {
            System.out.println("🗑️ finalize() llamado. El objeto está siendo recolectado.");
        }
    }

    public static void main(String[] args) {
        System.out.println("🧱 Creando objeto...");
        ObjetoPesado obj = new ObjetoPesado();

        System.out.println("🔗 Referencia activa. No será recolectado aún.");
        obj = null;

        System.out.println("🧹 Solicitando recolección de basura...");
        System.gc();

        System.out.println("⏳ Esperando...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("✅ Fin del programa.");
    }
}
