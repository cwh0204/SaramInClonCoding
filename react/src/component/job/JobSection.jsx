function JobSection({title, children}) {
  return (
    <>
        <section className="mt-[48px]">
            <h2 className="text-[18px] font-semibold mb-[16px]">
                {title}
            </h2>
            {children}
        </section>
    </>
  )
}

export default JobSection