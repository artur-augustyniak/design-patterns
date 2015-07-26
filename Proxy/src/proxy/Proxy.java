/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import proxy.virtual.implementation.ProxyBlobResource;
import proxy.virtual.model.BlobResource;

/**
 * http://pl.wikipedia.org/wiki/Pe%C5%82nomocnik_%28wzorzec_projektowy%29
 * Rodzaje i zastosowanie
 *
 * Istnieją cztery rodzaje tego wzorca, które jednocześnie definiują sytuacje, w
 * których może zostać użyty
 *
 * wirtualny – przechowuje obiekty, których utworzenie jest kosztowne; tworzy je
 * na żądanie
 *
 * ochraniający – kontroluje dostęp do obiektu sprawdzając, czy obiekt
 * wywołujący ma odpowiednie prawa do obiektu wywoływanego
 *
 * zdalny – czasami nazywany ambasadorem; reprezentuje obiekty znajdujące się w
 * innej przestrzeni adresowej
 *
 * sprytne odwołanie – czasami nazywany sprytnym wskaźnikiem; pozwala na
 * wykonanie dodatkowych akcji podczas dostępu do obiektu, takich jak: zliczanie
 * referencji do obiektu czy ładowanie obiektu do pamięci
 *
 * @author artur
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //virtual proxy
        BlobResource res = new ProxyBlobResource();
        res.touch();
        res.touch();
        res.touch();
    }
}
